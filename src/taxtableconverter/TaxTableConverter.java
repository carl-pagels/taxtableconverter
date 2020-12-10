package taxtableconverter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TaxTableConverter {

    private static final String ISSUE = "NGL732";
    private static final String YEAR = "2021";
    private static final String AUTHOR_NAME = "Pagels";
    private static final String REPO_PATH = "/Users/carlpagels/repos/payroll";
    private static final String TAX_TABLE_PATH = "/Users/carlpagels/Documents/taxtables";

    public static void main(String[] args) throws IOException {
        createFile();
    }

    private static void createFile() throws IOException {
        for (int taxTable = 29; taxTable <= 40; taxTable++) {
            final String pathName = String.format("%s/%s.csv", TAX_TABLE_PATH, taxTable);
            createLiquibaseFile(pathName, taxTable);
        }
        addMigrations("column1");
        addMigrations("column3");
    }
    private static void createLiquibaseFile(String pathName, int taxTable) throws IOException {
        createColumn(taxTable, pathName, 2, "column1");
        createColumn(taxTable, pathName, 4, "column3");
    }

    private static void createColumn(int taxTable, String pathName, int column, String columnName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathName));
        StringBuilder liquibaseFile = new StringBuilder(getHeaderString(taxTable, columnName));

        String insertStatement = getInsertStatementColumn1();
        if (column == 4) {
            insertStatement = getInsertStatementColumn3();
        }
        liquibaseFile.append(insertStatement);
        for (String line; (line = reader.readLine()) != null;) {
            final String taxInformation = processLine(line, taxTable, column);
            if (!taxInformation.isEmpty()) {
                liquibaseFile.append(taxInformation);
            }
        }
        liquibaseFile.deleteCharAt(liquibaseFile.length() - 2);
        liquibaseFile.append(getFooter());
        writeToFile(taxTable, liquibaseFile, columnName);
    }

    private static void writeToFile(int taxTable, StringBuilder liquibaseScript, String columnName) throws IOException {
        File directory = new File(String.format("%s/impl/src/main/resources/migrations/taxTableData_%s_%s", REPO_PATH, YEAR, columnName));
        if (!directory.exists()) {
            directory.mkdir();
        }
        String outputFilePath = String.format("%s/impl/src/main/resources/migrations/taxTableData_%s_%s/%s_%s_%s.xml", REPO_PATH, YEAR, columnName, ISSUE, columnName, taxTable);
        FileOutputStream outputStream = new FileOutputStream(outputFilePath);
        outputStream.write(liquibaseScript.toString().getBytes());
        outputStream.close();
    }

    private static String processLine(String line, int taxTable, int column) {
        line = line.replace(" - ", ";");
        line = line.replace(" ", ";");
        if (!line.matches(".*[a-zA-Z]+.*") && !line.contains("%")) {
            String[] columns = line.split(";");
            String minGross = columns[0];
            String maxGross = columns[1];
            String taxAmount = columns[column];
            String taxPercent = "null";
            int minNet;
            int maxNet;
            if (taxAmount.length() < 3) {
                taxPercent = taxAmount;
                minNet = (int) (Integer.parseInt(minGross) * (1 - (Double.parseDouble(taxPercent) / 100)));
                maxNet = (int) (Integer.parseInt(maxGross) * (1 - (Double.parseDouble(taxPercent) / 100)));
                if (maxNet < minNet) {
                    maxNet = Integer.MAX_VALUE;
                }
                taxAmount = "null";
            } else {
                minNet = Integer.parseInt(minGross) - Integer.parseInt(taxAmount);
                maxNet = Integer.parseInt(maxGross) - Integer.parseInt(taxAmount);
            }
            if (Integer.parseInt(maxGross) < Integer.parseInt(minGross)) {
                maxGross = String.valueOf(Integer.MAX_VALUE);
            }
            return String.format("            (%s, %s, %s, %s, %s, %s, %s, %s),%n", YEAR, taxTable, minGross,
                    maxGross, minNet, maxNet, taxAmount, taxPercent);
        }
        return "";
    }

    private static String getFooter() {
        return "          </sql>\n" +
                "    </changeSet>\n" +
                "</databaseChangeLog>";
    }

    private static String getInsertStatementColumn1() {
        return "            INSERT into TAX_RATES (income_year, tax_table, min_gross, max_gross, min_net, max_net, " +
                "tax_amount, tax_percent)\n            VALUES\n";
    }

    private static String getInsertStatementColumn3() {
        return "            INSERT into TAX_RATES_COLUMN_3 (income_year, tax_table, min_gross, max_gross, min_net, max_net, " +
                "tax_amount, tax_percent)\n            VALUES\n";
    }

    private static String getHeaderString(int taxTable, String columnName) {
        return String.format("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<databaseChangeLog xmlns=\"http://www.liquibase.org/xml/ns/dbchangelog\"\n" +
                "                   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "                   xsi:schemaLocation=\"http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.4.xsd\">\n" +
                "    <changeSet id=\"add_taxdata_table%s_%s_%s\" author=\"%s\">\n" +
                "        <sql>\n", taxTable, YEAR, columnName, AUTHOR_NAME);
    }

    private static void addMigrations(String columnName) throws IOException {
        String migrationFilePath = String.format("%s/impl/src/main/resources/migrations.xml", REPO_PATH);
        final String migrationText = String.format("    <includeAll path=\"migrations/taxTableData_%s_%s\"/>", YEAR, columnName);
        List<String> list = Files.readAllLines(Paths.get(migrationFilePath));
        list.add(list.size() - 1, migrationText);
        Files.write(Paths.get(migrationFilePath), list);
    }
}

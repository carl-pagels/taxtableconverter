package taxtableconverter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TaxTableConverter {

    private static final String ISSUE = "NGL209";
    private static final String YEAR = "2020";
    private static final String AUTHOR_NAME = "Pagels";
    private static final String REPO_PATH = "/Users/carl.pagels/repos/salary";
    private static final String TAX_TABLE_PATH = "/Users/carl.pagels/Documents";

    public static void main(String[] args) throws IOException {
        createFile();
    }

    private static void createFile() throws IOException {
        for (int taxTable = 29; taxTable <= 40; taxTable++) {
            final String pathName = String.format("%s/%s.csv", TAX_TABLE_PATH, taxTable);
            createLiquibaseFile(pathName, taxTable);
        }
        addMigrations();
    }

    private static void createLiquibaseFile(String pathName, int taxTable) throws IOException {
        File inputFile = new File(pathName);
        BufferedReader reader = new BufferedReader(new FileReader("sample.csv"));
        StringBuilder liquibaseScript = new StringBuilder(getHeaderString(taxTable));
        liquibaseScript.append(getInsertStatement());
        for (String line; (line = reader.readLine()) != null;) {
            final String taxInformation = processLine(line, taxTable);
            if (!taxInformation.isEmpty()) {
                liquibaseScript.append(taxInformation);
            }
        }
        liquibaseScript.deleteCharAt(liquibaseScript.length() - 2);
        liquibaseScript.append(getFooter());
        writeToFile(taxTable, liquibaseScript);
    }

    private static void writeToFile(int taxTable, StringBuilder liquibaseScript) throws IOException {
        File directory = new File(String.format("%s/impl/src/main/resources/migrations/taxTableData_%s", REPO_PATH, YEAR));
        if(!directory.exists()) {
            directory.mkdir();
        }
        String outputFilePath = String.format("%s/impl/src/main/resources/migrations/taxTableData_%s/%s_%s.xml", REPO_PATH, YEAR, ISSUE, taxTable);
        FileOutputStream outputStream = new FileOutputStream(outputFilePath);
        outputStream.write(liquibaseScript.toString().getBytes());
        outputStream.close();
    }

    private static String processLine(String line, int taxTable) {
        line = line.replace(" - ", ";");
        line = line.replace(" ", ";");
        if (!line.matches(".*[a-zA-Z]+.*") && !line.contains("%")) {
            String[] columns = line.split(";");
            String minGross = columns[0];
            String maxGross = columns[1];
            String taxAmount = columns[2];
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

    private static String getInsertStatement() {
        return "            INSERT into TAX_RATES (income_year, tax_table, min_gross, max_gross, min_net, max_net, " +
                "tax_amount, tax_percent)\n            VALUES\n";
    }

    private static String getHeaderString(int taxTable) {
        return String.format("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<databaseChangeLog xmlns=\"http://www.liquibase.org/xml/ns/dbchangelog\"\n" +
                "                   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "                   xsi:schemaLocation=\"http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.4.xsd\">\n" +
                "    <changeSet id=\"add_taxdata_table%s_%s\" author=\"%s\">\n" +
                "        <sql>\n", taxTable, YEAR, AUTHOR_NAME);
    }

    private static void addMigrations() throws IOException {
        String migrationFilePath = String.format("%s/impl/src/main/resources/migrations.xml", REPO_PATH);
        final String migrationText = String.format("    <includeAll path=\"migrations/taxTableData_%s\"/>", YEAR);
        List<String> list = Files.readAllLines(Paths.get(migrationFilePath));
        list.add(list.size() - 1, migrationText);
        Files.write(Paths.get(migrationFilePath), list);
    }
}

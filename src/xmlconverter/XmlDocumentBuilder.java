package xmlconverter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.List;

public class XmlDocumentBuilder {

    private XmlDocumentBuilder() {
        throw new IllegalStateException("Util class, not to be initialized");
    }

    static Document generateDocument(String filePath, String fileName) throws ParserConfigurationException, IOException {
        Document document;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath, fileName)))) {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            document = docFactory.newDocumentBuilder().newDocument();

            Element root = document.createElement("Xmlconverter");
            document.appendChild(root);

            appendNodes(document, new CSVData(reader), root);
        }
        return document;
    }

    static void appendNodes(Document document, CSVData csvData, Element root) {
        final String[] categories = csvData.getCategories();
        final List<String> lines = csvData.getLines();
        for (int line = 1; line < lines.size(); line++) {
            // One tag named row for each line in csv file
            Element row = document.createElement("row");
            final String[] values = lines.get(line).split(",");
            for (int i = 0; i < categories.length; i++) {
                final String category = categories[i];
                if (category.isEmpty()) {
                    continue;
                }
                final Element categoryElement = createCategoryElement(document, category, Utils.getValue(values, i));
                row.appendChild(categoryElement);
                root.appendChild(row);
            }
        }
    }

    static Element createCategoryElement(Document doc, String category, String value) {
        final Element categoryElement = doc.createElement(category);
        categoryElement.appendChild(doc.createTextNode(value));
        return categoryElement;
    }
}

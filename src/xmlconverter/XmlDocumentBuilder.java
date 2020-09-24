package xmlconverter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

            Element root = document.createElement("Root");
            document.appendChild(root);

            return appendNodes(document, new CSVData(reader), root);
        }
    }

    static Document appendNodes(Document document, CSVData csvData, Element root) {
        final String[] categories = csvData.getCategories();
        final List<String> lines = csvData.getLines();
        // Start on 1 to avoid category line
        for (int lineIndex = 1; lineIndex < lines.size(); lineIndex++) {
            // One tag named row for each line in csv file
            Element row = document.createElement("row");
            final String[] values = lines.get(lineIndex).split(",");
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
        return document;
    }

    static Element createCategoryElement(Document doc, String category, String value) {
        final Element categoryElement = doc.createElement(category);
        categoryElement.appendChild(doc.createTextNode(value));
        return categoryElement;
    }
}

package xmlconverter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class XmlConverter {

    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
        Document document;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/carl.pagels/repos/taxtableconverter/src/xmlconverter/hej.csv")))) {
            final String[] categories = getCategories(reader.readLine());
            document = createDocument();
            Element root = document.createElement("Xmlconverter");
            document.appendChild(root);

            for (String line; (line = reader.readLine()) != null; ) {
                // One tag named row for each line in csv file
                Element row = document.createElement("row");
                final String[] values = line.split(",");
                for (int i = 0; i < categories.length; i++) {
                    final String category = categories[i];
                    if (category.isEmpty()) {
                        continue;
                    }
                    String value = "";
                    if (values.length > i) {
                        value = values[i];
                    }
                    final Element categoryElement = createCategoryElement(document, category, value);
                    row.appendChild(categoryElement);
                    root.appendChild(row);
                }
            }
        }
        generateXMlFile(document);
    }

    private static void generateXMlFile(Document document) throws TransformerException, IOException {
        TransformerFactory tf = TransformerFactory.newInstance();
        tf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(writer));

        File file = new File("generated.xml");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(writer.getBuffer().toString());
        }
    }

    private static Document createDocument() throws ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        return docFactory.newDocumentBuilder().newDocument();
    }

    /**
     * // Assumes that the first line is the columns. Filter out illegal characters for xml files
     * @param line The initial line to get categories from
     * @return with illegal characters escaped
     */
    private static String[] getCategories(String line) {
        return line
                .replace("\"", "")
                .replace(" ", "")
                .replace("#", "")
                .replace("(", "_x0028_")
                .replace(")", "_x0029_")
                .replace("?", "")
                .split(",");
    }

    private static Element createCategoryElement(Document doc, String category, String value) {
        final Element categoryElement = doc.createElement(category);
        categoryElement.appendChild(doc.createTextNode(value));
        return categoryElement;
    }
}

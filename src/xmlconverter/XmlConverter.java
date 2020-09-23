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
        Document doc;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/carl.pagels/repos/taxtableconverter/src/xmlconverter/cities.csv")))) {

            String firstLine = reader.readLine();
            //Assumes that the first line is the columns. Filter out illegal characters for xml files
            final String[] categories = firstLine.replace("\"", "").replace(" ", "").split(",");

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            docFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            doc = docFactory.newDocumentBuilder().newDocument();

            Element root = doc.createElement("Xmlconverter");
            doc.appendChild(root);

            for (String line; (line = reader.readLine()) != null; ) {
                final String[] values = line.split(",");
                Element row = doc.createElement("row");
                for (int i = 0; i < categories.length; i++) {
                    if (values.length <= i) {
                        break;
                    }
                    final Element categoryElement = createCategoryElement(doc, categories[i], values[i]);
                    row.appendChild(categoryElement);
                    root.appendChild(row);
                }
            }
        }
        TransformerFactory tf = TransformerFactory.newInstance();
        tf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));

        File file = new File("generated.xml");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(writer.getBuffer().toString());
        }
    }

    private static Element createCategoryElement(Document doc, String category, String value) {
        final Element categoryElement = doc.createElement(category);
        categoryElement.appendChild(doc.createTextNode(value));
        return categoryElement;
    }
}

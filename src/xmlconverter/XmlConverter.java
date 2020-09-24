package xmlconverter;

import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XmlConverter {

    private static final String FILE_PATH = "/Users/carl.pagels/repos/taxtableconverter/src/xmlconverter/data";
    private static final String FILE_NAME = "hej.csv";

    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
        Document document = XmlDocumentBuilder.generateDocument(FILE_PATH, FILE_NAME);
        XmlGenerator.generateXMlFile(document);
    }

}

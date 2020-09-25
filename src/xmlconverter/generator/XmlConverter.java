package xmlconverter.generator;

import org.w3c.dom.Document;
import xmlconverter.ui.UIFrame;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XmlConverter {

    private XmlConverter() {
        throw new IllegalStateException("Util class, not to be initialized");
    }

    /**
     * Gets called when user press the Convert now button - Starts the program and getting the file from the selected filepath
     */
    public static void convertCSV(UIFrame uiFrame) throws IOException, ParserConfigurationException, TransformerException {
        Document document = XmlDocumentBuilder.generateDocument(uiFrame.getFilePath());
        FileGenerator.generateXMlFile(document, uiFrame);
    }

}

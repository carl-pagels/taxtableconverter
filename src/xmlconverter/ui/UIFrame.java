package xmlconverter.ui;


import xmlconverter.generator.XmlConverter;
import xmlconverter.ui.components.*;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class UIFrame extends JFrame implements ActionListener {

    /**
     * Paths
     */
    private String filePath;
    private String savePath;

    /**
     * Buttons
     */
    private final LoadPathButton loadFileButton = new LoadPathButton(this);
    private final ExitButton exitButton = new ExitButton(this);
    private final DoConversionButton doConversionButton = new DoConversionButton(this);
    private final SavePathButton savePathButton = new SavePathButton(this);

    /**
     * Labels
     */
    private final LoadPathLabel loadPathLabel = new LoadPathLabel();
    private final SavePathLabel savePathLabel = new SavePathLabel();

    /**
     * Setting all data and information to the UI components
     */
    public UIFrame() {
        addComponents(new MenuBar(exitButton), doConversionButton, savePathButton, loadFileButton, new LabelInfo(), loadPathLabel, savePathLabel);
        setupFrameData();
    }

    /**
     * Set frame data(Size, layout etc)
     */
    private void setupFrameData() {
        this.setSize(300, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * @param components All components to add
     */
    private void addComponents(JComponent... components) {
        for(JComponent component : components) {
            add(component);
        }
    }

    /**
     * User made Performed an action - Check if the action was something to trigger
     */
    @Override
    public void actionPerformed(ActionEvent action) {

        if (exitButton.equals(action.getSource())) {
            // User clicked Exit in the menu - Closing program
            System.exit(0);
        }
        if (loadFileButton.equals(action.getSource())) {
            loadFile();
        } else if (doConversionButton.equals(action.getSource())) {
            doConversion();
        } else if (savePathButton.equals(action.getSource())) {
            selectSavePath();
        }
    }


    /**
     * Loads the CSV file to convert
     */
    private void loadFile() {
       LoadPathFileChooser loadPathFileChooser = new LoadPathFileChooser();
        if (loadPathFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //Get some data from the file and set variables and references - Also enable the button "Convert Now"
            File file = loadPathFileChooser.getSelectedFile();
            filePath = file.getPath();
            String fileName = file.getName();
            loadPathLabel.setText("Selected CSV file: " + fileName);
            doConversionButton.setEnabled(true);
        }
    }

    /**
     * Does conversion to xml file
     */
    private void doConversion() {
        try {
            XmlConverter.convertCSV(this);
        } catch (IOException | ParserConfigurationException | TransformerException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * Selects the save path for the generated file
     */
    private void selectSavePath() {
        SavePathFileChooser savePathFileChooser = new SavePathFileChooser();
        if (savePathFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            savePath = (savePathFileChooser.getSelectedFile() + "/GeneratedXML.xml");
            savePathLabel.setText("Selected savepath: " + savePath);
        }
    }

    public void displaySuccess() {
        doConversionButton.setText("Successfully converted CSV to XML");
    }

    public String getFilePath() {
        return filePath;
    }

    public String getSavePath() {
        return savePath;
    }
}

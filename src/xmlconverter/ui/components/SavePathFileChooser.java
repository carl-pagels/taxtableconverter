package xmlconverter.ui.components;

import javax.swing.*;

public class SavePathFileChooser extends JFileChooser {

    public SavePathFileChooser() {
        this.setCurrentDirectory(new java.io.File("."));
        this.setDialogTitle("Select Save Folder");
        this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.setAcceptAllFileFilterUsed(false);
    }
}

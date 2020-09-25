package xmlconverter.ui.components;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LoadPathFileChooser extends JFileChooser {

    public LoadPathFileChooser() {
        //Set the FileChooser filter to only accept CSV files and nothing else
        this.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
        this.setFileFilter(filter);
    }
}

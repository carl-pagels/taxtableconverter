package xmlconverter.ui.components;

import javax.swing.*;

public class LabelInfo extends JLabel {
    public LabelInfo() {
        this.setText("<html>How to convert CSV file to XML file: <br><br>1: Click <b>open CSV file</b> and select your CSV file <br>2: Click <b>select save location</b> and select where you want to save <br>3: Click <b>Convert now</b></html>");
        this.setBounds(0, 250, 300, 100);
    }
}

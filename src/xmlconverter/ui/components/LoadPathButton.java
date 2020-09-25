package xmlconverter.ui.components;


import xmlconverter.ui.UIFrame;

import javax.swing.*;

public class LoadPathButton extends JButton {

    public LoadPathButton(UIFrame uiFrame) {
        this.setBounds(0, 20, 300, 50);
        this.setText("Open CSV file");
        this.addActionListener(uiFrame);
    }
}

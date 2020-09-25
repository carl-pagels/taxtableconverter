package xmlconverter.ui.components;


import xmlconverter.ui.UIFrame;

import javax.swing.*;

public class SavePathButton extends JButton {

    public SavePathButton(UIFrame uiFrame) {
        this.setBounds(0, 100, 300, 50);
        this.setText("Select save location");
        this.addActionListener(uiFrame);
    }
}

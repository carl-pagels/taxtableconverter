package xmlconverter.ui.components;


import xmlconverter.ui.UIFrame;

import javax.swing.*;

public class DoConversionButton extends JButton {

    public DoConversionButton(UIFrame uiFrame) {
        this.setText("Convert now");
        this.setBounds(0, 175, 300, 50);
        this.setEnabled(false);
        this.addActionListener(uiFrame);

    }
}

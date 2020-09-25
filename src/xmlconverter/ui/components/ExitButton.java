package xmlconverter.ui.components;


import xmlconverter.ui.UIFrame;

import javax.swing.*;

public class ExitButton extends JMenuItem {

    public ExitButton(UIFrame uiFrame) {
        this.addActionListener(uiFrame);
    }
}

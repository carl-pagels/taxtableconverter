package xmlconverter.ui.components;

import javax.swing.*;

public class MenuBar extends JComponent {
    public MenuBar(ExitButton exitButton) {
        final Menu menu = new Menu(exitButton);
        this.setBounds(0, 0, 300, 20);
        this.add(menu);
    }
}

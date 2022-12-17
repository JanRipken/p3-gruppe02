
package main.tomedb.java.mainframe.view.menubar;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;
import main.tomedb.java.mainframe.view.MainFrame;

public class Minimized {
    private ImageIcon minimizeIcon;
    private JButton minimizeButton;

    public Minimized() {
        // get icon
        minimizeIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/minimize-sign.png", 10, 10);
 
        minimizeButton = new JButton();

        minimizeButton.setIcon(minimizeIcon);

        minimizeButton.setPreferredSize(new Dimension(20, 20));
    }

    public JButton makeMinimize() {

        return minimizeButton;
    }

}

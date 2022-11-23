
package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrame;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;

public class Close extends JMenu {

    private ImageIcon CloseIcon;
    private JButton closeButton;

    public Close() {
        // getting the icon for our Button
        CloseIcon = new ImageIcon(this.getClass().getResource("/main/tomedb/ressources/icons/close.png"));
        Image image = CloseIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
        CloseIcon = new ImageIcon(newimg);
        CloseIcon.getImage();

        closeButton = new JButton();

        closeButton.setIcon(CloseIcon);

        closeButton.setPreferredSize(new Dimension(20, 20));

        CloseMainFrame close = new CloseMainFrame();
        closeButton.addActionListener(close);

    }

    public JButton makeClose() {

        return closeButton;
    }
}

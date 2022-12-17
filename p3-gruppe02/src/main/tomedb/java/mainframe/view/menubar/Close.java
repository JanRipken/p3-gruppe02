
package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrame;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;
import main.tomedb.java.mainframe.view.MainFrame;

public class Close extends JMenu {

    private ImageIcon CloseIcon;
    private JButton closeButton;

    public Close() {
      
        CloseIcon= MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/close.png",10,10);
        
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

package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrameAction;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import main.tomedb.java.mainframe.view.MainFrame;

public class BuildCloseButton extends JMenu {

    private ImageIcon closeMainFrameIcon;
    private JButton closeMainFrameButton;

    public BuildCloseButton() {

        closeMainFrameIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/close.png", 10, 10);

        closeMainFrameButton = new JButton();

        closeMainFrameButton.setIcon(closeMainFrameIcon);

        closeMainFrameButton.setPreferredSize(new Dimension(20, 20));

        CloseMainFrameAction closeMainFrameAction = new CloseMainFrameAction();
        closeMainFrameButton.addActionListener(closeMainFrameAction);
    }

    public JButton returnCloseMainFrameButton() {
        return closeMainFrameButton;
    }
}

package main.tomedb.java.mainframe.view.menubar;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.tomedb.java.mainframe.controller.menubar.MinimizeMainFrameAction;
import main.tomedb.java.mainframe.view.MainFrame;

public class BuildMinimizeButton {

    private ImageIcon minimizeIcon;
    private JButton minimizeButton;

    public BuildMinimizeButton() {

        minimizeIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/minimize-sign.png", 10, 10);
        minimizeButton = new JButton();
        MinimizeMainFrameAction minimizeMainFrame = new MinimizeMainFrameAction();
        minimizeButton.addActionListener(minimizeMainFrame);
        minimizeButton.setIcon(minimizeIcon);
        minimizeButton.setPreferredSize(new Dimension(20, 20));
    }

    public JButton returnMinimizeButton() {

        return minimizeButton;
    }

}

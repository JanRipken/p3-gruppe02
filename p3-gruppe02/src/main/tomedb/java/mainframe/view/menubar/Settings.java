package main.tomedb.java.mainframe.view.menubar;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.controller.menubar.Setting;

public class Settings {

    private ImageIcon settingsIcon;
    private JButton settingsButton;

    public Settings() {

        settingsIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/settingsIcon.png", 10, 10);

        settingsButton = new JButton();

        settingsButton.setIcon(settingsIcon);

        settingsButton.setPreferredSize(new Dimension(20, 20));
        Setting set = new Setting();
        settingsButton.addActionListener(set);
        
    }

    public JButton makeSettings() {

        return settingsButton;
    }

}

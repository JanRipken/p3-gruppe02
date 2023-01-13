package main.tomedb.java.mainframe.view.menubar;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.controller.menubar.SettingsPanelOpen;

public class BuildSettingsButton {

    private ImageIcon icon;
    private JButton button;

    public BuildSettingsButton() {

        icon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/settingsIcon.png", 10, 10);

        button = new JButton();

        button.setIcon(icon);

        button.setPreferredSize(new Dimension(20, 20));
        SettingsPanelOpen settingsPanelOpen = new SettingsPanelOpen();
        button.addActionListener(settingsPanelOpen);
        
    }

    public JButton returnSettingsButton() {

        return button;
    }

}

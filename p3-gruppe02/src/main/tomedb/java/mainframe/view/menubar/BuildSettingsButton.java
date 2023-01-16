package main.tomedb.java.mainframe.view.menubar;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.controller.menubar.OpenSettingsPanelAction;

public class BuildSettingsButton {

    private ImageIcon icon;
    private JButton button;

    public BuildSettingsButton() {

        icon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/settingsIcon.png", 10, 10);

        button = new JButton();

        button.setIcon(icon);

        button.setPreferredSize(new Dimension(20, 20));
        OpenSettingsPanelAction settingsPanelOpen = new OpenSettingsPanelAction();
        button.addActionListener(settingsPanelOpen);
        
    }

    protected JButton returnSettingsButton() {

        return button;
    }

}

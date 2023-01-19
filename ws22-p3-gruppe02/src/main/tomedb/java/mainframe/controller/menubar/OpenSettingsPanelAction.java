package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.main.TomeDB;
import main.tomedb.java.mainframe.view.SettingsPanel;

public class OpenSettingsPanelAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        SettingsPanel settingsPanel = new SettingsPanel();

        TomeDB.mainFrame.add(settingsPanel);
        TomeDB.mainFrame.setContentPane(settingsPanel);
    }
}

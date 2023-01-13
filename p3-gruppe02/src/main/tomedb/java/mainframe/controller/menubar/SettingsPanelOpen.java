package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.view.SettingsPanel;

public class SettingsPanelOpen implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        SettingsPanel panel = new SettingsPanel();

        TomeDB.mainFrame.add(panel);
        TomeDB.mainFrame.setContentPane(panel);
    }
}

package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.view.SettingsPanel;



public class Setting implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        showSettingsPanel();
    }

    public void showSettingsPanel() {
        SettingsPanel panel = new SettingsPanel();

        TomeDB.main.add(panel);
        TomeDB.main.setContentPane(panel);
        TomeDB.main.revalidate();
        TomeDB.main.repaint();

    }

}

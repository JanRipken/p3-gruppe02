package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.dao.SettingsReadWrite;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class SettingsSave implements ActionListener {

    private JComboBox cbSaveMode;

    public SettingsSave(JComboBox cbSaveMode) {
        this.cbSaveMode = cbSaveMode;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mode = cbSaveMode.getSelectedItem().toString();
        SettingsReadWrite set = new SettingsReadWrite();
        try {
            set.write(mode);
        } catch (IOException ex) {
            Logger.getLogger(SettingsSave.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.main.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.designtemplate.modes.DarkMode;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.dao.SettingsReadWrite;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class SettingsAbort implements ActionListener {

    public SettingsAbort() {

    }

    public void resetLookAndFeel() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        SettingsReadWrite set = new SettingsReadWrite();
        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightMode();
        }
        if (mode.equals("Dunkel")) {

            new DarkMode();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            resetLookAndFeel();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SettingsAbort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SettingsAbort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SettingsAbort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SettingsAbort.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.main.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

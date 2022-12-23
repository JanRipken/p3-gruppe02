/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.mainframe.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

/**
 *
 * @author janri
 */
public class SettingsSave implements ActionListener {

    private Preferences prefs;
    String lookAndFeel;
    public static String lookAndFeelClassName;

    public SettingsSave() {
        prefs = Preferences.userNodeForPackage(getClass());

    }

    public void saveLookandFeel() {
        prefs.put("lookandfeel", lookAndFeel);
    }

    public void loadLookandfell() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // Lade den Look and Feel aus den Einstellungen
        lookAndFeelClassName = prefs.get("lookandfeel", UIManager.getSystemLookAndFeelClassName());
        try {
            UIManager.setLookAndFeel(lookAndFeelClassName);
        } catch (Exception ex) {
            //ex.printStackTrace();
        }

        System.out.println(lookAndFeelClassName);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lookAndFeel = UIManager.getLookAndFeel().getName();
        saveLookandFeel();
        TomeDB.main.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

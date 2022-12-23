package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.controller.SettingsSave;

import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.view.SettingsPanel;

public class TomeDB {

    public static MainFrame main;
    
    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    SettingsSave save = new SettingsSave();
                    new DarkMode();
                    save.loadLookandfell();
                    
                    
                    showMainFrame();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static void showMainFrame() {
        main = new MainFrame();
    }

}

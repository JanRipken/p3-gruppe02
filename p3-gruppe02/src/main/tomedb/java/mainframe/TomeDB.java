package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.mainframe.controller.SettingsSave;

import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.view.SettingsPanel;

public class TomeDB {

    public static MainFrame main;
    public static NimbusLookAndFeel nimb;
    
    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    nimb = new NimbusLookAndFeel();
                    UIManager.setLookAndFeel(nimb);
  
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

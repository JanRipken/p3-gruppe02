package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.mainframe.controller.SettingsSave;
import main.tomedb.java.mainframe.controller.menubar.themeChange;
import main.tomedb.java.mainframe.dao.SettingsDAO;

import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.view.SettingsPanel;

public class TomeDB {

    public static MainFrame main;

    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {

                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    setMode();
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

    private static void setMode() throws IllegalAccessException, ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
        SettingsDAO set = new SettingsDAO();

        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightMode();
        }
        if (mode.equals("Dunkel")) {

            new DarkMode();
        } else {

            System.out.println("Fail");

        }
    }

}

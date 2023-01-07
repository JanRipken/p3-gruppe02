package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.mainframe.dao.SettingsReadWrite;
import main.tomedb.java.mainframe.view.MainFrame;

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
        SettingsReadWrite set = new SettingsReadWrite();

        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightMode();
        }
        if (mode.equals("Dunkel")) {

            new DarkMode();
        } else {

            System.out.println("Failed to load a Mode");

        }
    }

}

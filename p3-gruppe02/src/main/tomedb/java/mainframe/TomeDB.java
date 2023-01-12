package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.designtemplate.modes.SetMode;
import main.tomedb.java.mainframe.controller.settings.ReadWrite;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {

    public static MainFrame mainFrame;

    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {

                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    new SetMode();
                    showMainFrame();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static void showMainFrame() {
        mainFrame = new MainFrame();
    }
}
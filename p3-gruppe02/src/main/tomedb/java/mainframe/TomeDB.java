package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.modes.DarkMode;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {
    public static MainFrame main;
    public static void main(String[] args) throws ClassNotFoundException {
     
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {

                     new DarkMode();
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

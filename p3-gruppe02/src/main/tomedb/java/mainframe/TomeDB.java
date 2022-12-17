package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.TomeDBDesignTemplate;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {

    public static void main(String[] args) throws ClassNotFoundException {
     
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {

                     new TomeDBDesignTemplate();
                    showMainFrame();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static void showMainFrame() {
        new MainFrame();
    }

}

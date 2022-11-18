package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.TomeDBDesignTemplate;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.view.MainFrame;

public class P3Gruppe02 {

    public static void main(String[] args) {

        /**
         * TODO: Warum wir das so machen erläutern
         *
         */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    TomeDBDesignTemplate design = new TomeDBDesignTemplate();

                    showMainFrame();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void showMainFrame() {
        new MainFrame();
    }

}

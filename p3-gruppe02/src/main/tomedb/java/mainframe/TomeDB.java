package main.tomedb.java.mainframe;

import main.tomedb.java.designtemplate.TomeDBDesignTemplate;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {

    public static void main(String[] args) {

        /**
         * TODO: Reicht so ?
         *
         * Mit invoke later stellen wir sicher das das unser GUI Kommponenten
         * aus jedem Thread heraus vernüftig starten und nicht nur aus dem
         * Event-Dispatch-Thread damit stellen wir sicher, das unsere App immer
         * sauber läuft und alles geupdated wird.
         *
         */
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

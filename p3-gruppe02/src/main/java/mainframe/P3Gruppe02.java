package main.java.mainframe;

import main.java.designtemplate.appDesign;
import javax.swing.SwingUtilities;
import main.java.mainframe.view.MainFrame;

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
                    appDesign design = new appDesign();

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

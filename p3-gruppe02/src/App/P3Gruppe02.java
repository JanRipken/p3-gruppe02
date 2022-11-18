package App;

import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import view.MainFrames.MainFrame;

public class P3Gruppe02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                   appDesign design=new appDesign();

                    showMainFrame();

                    //UIManager.put("control", new Color( 128, 128, 128));
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

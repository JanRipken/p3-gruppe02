
package App;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.BookModelList;
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
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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

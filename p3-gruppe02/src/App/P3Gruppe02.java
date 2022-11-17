
package App;

import javax.swing.SwingUtilities;
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

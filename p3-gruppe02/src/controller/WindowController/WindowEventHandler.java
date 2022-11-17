
package controller.WindowController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class WindowEventHandler extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.out.println("exit");
        
        // Speicher in DOA on Close 
        System.exit(0);
    }
}

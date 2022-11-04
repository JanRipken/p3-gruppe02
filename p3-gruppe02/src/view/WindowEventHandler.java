
package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author matthiaskoziol
 */
public class WindowEventHandler extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.out.println("exit");
        System.exit(0);
    }
}

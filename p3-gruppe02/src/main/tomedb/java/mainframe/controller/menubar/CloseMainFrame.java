package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.controller.SaveOnClose;

/**
 * Window Handler for closing the Main Frame
 */
public class CloseMainFrame implements ActionListener {

    /**
     * @param changedTable variable to watch out if the JTable Changes
     */
    public static boolean changedTable = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTable == true) {
            new SaveOnClose();
        }

        // Exit our App
        System.out.println("exit");
        System.exit(0);
    }

}

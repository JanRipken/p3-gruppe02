package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.controller.SaveOnClose;

public class CloseMainFrame implements ActionListener {

    public static boolean changedTable = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTable == true) {
            new SaveOnClose();
        }

        System.exit(0);
    }

}

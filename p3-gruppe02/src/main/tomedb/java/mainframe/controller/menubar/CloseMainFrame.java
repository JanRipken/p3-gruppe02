package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.controller.SaveOnClose;

public class CloseMainFrame implements ActionListener {

    public static boolean changedTableState = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTableState == true) {
            new SaveOnClose();
        }
        System.exit(0);
    }
}
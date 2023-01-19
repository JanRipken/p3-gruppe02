package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseMainFrameAction implements ActionListener {

    public static boolean changedTableState = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTableState == true) {
            new SaveIfModified();
        }
        System.exit(0);
    }
}
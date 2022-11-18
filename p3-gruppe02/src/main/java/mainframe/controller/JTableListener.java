package main.java.mainframe.controller;

import main.java.mainframe.controller.menubar.CloseMainFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

//Controller zum erkennen ob sich das JTable geändert hat
public class JTableListener implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrame.changedTable = true;
    }

}

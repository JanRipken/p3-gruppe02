package main.tomedb.java.mainframe.controller;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 * JTableChanged listens to our JTable and if the table changes sets our
 * variable to true
 *
 */
public class JTableChanged implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrame.changedTable = true;
    }

}

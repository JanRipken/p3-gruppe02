package main.tomedb.java.mainframe.controller.jtable;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrameAction;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class TableState implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrameAction.changedTableState = true;
    }
}

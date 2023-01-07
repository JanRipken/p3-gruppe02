package main.tomedb.java.mainframe.controller.jtable;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class Changed implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrame.changedTable = true;
    }

}

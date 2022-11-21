package main.tomedb.java.mainframe.controller;

import main.tomedb.java.mainframe.controller.menubar.CloseMainFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * Mit der JTableChanged Klasse wollen wir gucken ob sich unser JTable zur
 * laufzeit geändert hat um so später nur abzufragen ob man speichern möchte
 * wenn auch wirklich etwas geändert wurde
 *
 */
public class JTableChanged implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrame.changedTable = true;
    }

}

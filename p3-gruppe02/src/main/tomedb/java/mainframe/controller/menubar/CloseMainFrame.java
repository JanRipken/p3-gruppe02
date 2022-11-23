package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.controller.SaveOnClose;

public class CloseMainFrame implements ActionListener {

    /**
     * @param changedTable variable zum erkennen ob der JTable gändert wurde
     */
    public static boolean changedTable = false;

    // sollte sich das JTable gändert haben erscheint die abfrage ob man speichern
    // möchte
    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTable == true) {
            new SaveOnClose();
        }

        // Beenden des Programms
        System.out.println("exit");
        System.exit(0);
    }

}

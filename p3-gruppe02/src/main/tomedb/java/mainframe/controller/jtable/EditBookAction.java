package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState;

public class EditBookAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewOrEditBookState.editState = true;
                    new main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    
                }
            }
        });

    }
}

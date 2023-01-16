package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.main.model.BookModelList;
import static main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState.editState;

public class NewBookAction implements ActionListener {

    public NewBookAction() {

        new BookModelList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    editState = false;
                    new main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

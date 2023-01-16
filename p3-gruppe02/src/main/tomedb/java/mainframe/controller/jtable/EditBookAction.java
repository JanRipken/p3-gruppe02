package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.main.model.BookModelList;

import main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState;

public class EditBookAction implements ActionListener {



    public EditBookAction() {
       new BookModelList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewOrEditBookState.editState = true;
                    new main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

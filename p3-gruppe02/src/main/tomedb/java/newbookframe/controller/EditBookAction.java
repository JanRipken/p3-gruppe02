package main.tomedb.java.newbookframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.model.BookModelList;

import static main.tomedb.java.newbookframe.controller.NewBookOrEditBookState.editState;

public class EditBookAction implements ActionListener {



    public EditBookAction() {
       new BookModelList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    editState = true;
                    new main.tomedb.java.newbookframe.view.NewOrEditFrame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

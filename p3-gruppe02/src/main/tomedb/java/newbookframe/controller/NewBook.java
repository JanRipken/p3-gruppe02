package main.tomedb.java.newbookframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.model.BookModelList;
import static main.tomedb.java.newbookframe.controller.NewOrEdit.newOrEdit;

public class NewBook implements ActionListener {

    BookModelList modelBook;

    public NewBook() {

        modelBook = new BookModelList();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    newOrEdit = 1;
                    new main.tomedb.java.newbookframe.view.NewBook();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

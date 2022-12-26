package main.tomedb.java.editbookframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.model.BookModelList;

public class EditBook implements ActionListener {

    BookModelList modelBook;

    public EditBook() {

        modelBook = new BookModelList();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main.tomedb.java.editbookframe.view.EditBook();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

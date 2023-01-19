package main.tomedb.java.neworeditbookframe.controller;

import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.neworeditbookframe.view.InputTitelDialog;

public class SaveAction implements ActionListener {

    private NewOrEditBookFrame view;
    private BookModel bookModel;

    public SaveAction(NewOrEditBookFrame view, BookModel book) {
        this.view = view;
        this.bookModel = book;
    }

    private void setBookModel() {

        bookModel.setTitle(view.getTitle());
        bookModel.setAuthorLastName(view.getAuthorLastName());
        bookModel.setAuthorFirstName(view.getAuthorFirstName());
        bookModel.setYearOfRelease(view.getYearOfRelease());
        bookModel.setPageCount(view.getPageCount());
        bookModel.setRating(view.getRating());
        bookModel.setReadStatus(view.getReadStatus());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (view.getTitle().equals("")) {
                new InputTitelDialog();
            } else {

                if (bookModel.getTitle() == null) {
                    setBookModel();
                    MainPanel.table.tableAdditor.addToTable(bookModel);

                } else {
                    setBookModel();
                    MainPanel.table.tableAdditor.editToTable();

                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.err.println(ex);
        }

    }

}

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

    public SaveAction(NewOrEditBookFrame view) {
        this.view = view;

    }

    private void setBookModel() {


        bookModel.setTitle(view.getTitel());
        bookModel.setAuthorLastName(view.getAutorName());
        bookModel.setAuthorFirstName(view.getAutorVorname());
        bookModel.setYearOfRelease(view.getErscheinungsjahr());
        bookModel.setPageCount(view.getSeitenzahl());
        bookModel.setRating(view.getbewertung());
        bookModel.setReadStatus(view.getNochmallesen());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (view.getTitel().equals("")) {
                new InputTitelDialog();
            } else {

                if (bookModel != null) {
                    setBookModel();
                    MainPanel.table.tableController.editToTable();
                } else {
                    bookModel = new BookModel();
                    setBookModel();
                    MainPanel.table.tableController.addToTable(bookModel);
                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.err.println(ex);
        }

    }

}

package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewBookOrEditBookFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.newbookframe.view.InputTitelDialog;
import static main.tomedb.java.newbookframe.controller.NewBookOrEditBookState.editState;

public class SaveAction implements ActionListener {

    private NewBookOrEditBookFrame view;
    private BookModel bookModel;
    public BookModelList bookModelList;
    public JTable jTable;

    public SaveAction(NewBookOrEditBookFrame view) {
        if (editState == true) {
            this.bookModelList = Table.bookModelList;
            this.jTable = MainPanel.table.jTable;
            int[] bookIndex = jTable.getSelectedRows();
            this.bookModel = bookModelList.getBook(bookIndex[0]);
            this.view = view;
        } else {
            this.bookModel = new BookModel();
            this.view = view;

        }

    }

    public void setBookModel() {

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
                setBookModel();
                if (editState == true) {
                    MainPanel.table.editToTable(bookModel);
                } else {
                    MainPanel.table.addToTable(bookModel);
                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.err.println(ex);
        }

    }

}

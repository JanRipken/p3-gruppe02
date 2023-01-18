package main.tomedb.java.neworeditbookframe.controller;

import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.neworeditbookframe.view.InputTitelDialog;
import static main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState.editState;

public class SaveAction implements ActionListener {

    private NewOrEditBookFrame view;
    private BookModel bookModel;
    private BookModelList bookModelList;
    private JTable jTable;

    public SaveAction(NewOrEditBookFrame view) {
        this.view = view;
    }


    private void setBookModel() {
        if (editState == true) {
            this.bookModelList = Table.bookModelList;
            this.jTable = MainPanel.table.jTable;
            int[] bookIndex = jTable.getSelectedRows();
            this.bookModel = bookModelList.getBook(bookIndex[0]);
        } else {
            this.bookModel = new BookModel();
        }

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
                    
                    
                    MainPanel.table.tableController.editToTable();
                } else {
                    
                    
                    MainPanel.table.tableController.addToTable(bookModel);
                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.err.println(ex);
        }

    }

}

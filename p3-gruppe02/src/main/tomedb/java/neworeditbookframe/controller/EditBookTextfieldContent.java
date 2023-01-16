package main.tomedb.java.neworeditbookframe.controller;

import javax.swing.JTable;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import static main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState.editState;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.title;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.lastName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.firstName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.yearOfRelease;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.pageCount;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.rating;

public class EditBookTextfieldContent {

    private BookModel bookModel;
    public BookModelList bookModelList;
    public JTable jTable;

    /**
     * Einsetzen von vorhanden werten beim edititeren eines Objektes 
     */
    public EditBookTextfieldContent() {
        if (editState == true) {
            this.bookModelList = Table.bookModelList;
            this.jTable = MainPanel.table.jTable;
            int[] bookIndex = jTable.getSelectedRows();
            this.bookModel = bookModelList.getBook(bookIndex[0]);
            title.setText(bookModel.getTitle());
            lastName.setText(bookModel.getAuthorLastName());
            firstName.setText(bookModel.getAuthorFirstName());
            yearOfRelease.setText(Integer.toString(bookModel.getYearOfRelease()));
            pageCount.setText(Integer.toString(bookModel.getPageCount()));
            rating.setText(Double.toString(bookModel.getRating()));
        }
    }
}

package main.tomedb.java.neworeditbookframe.controller;

import javax.swing.JTable;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import static main.tomedb.java.neworeditbookframe.controller.NewOrEditBookState.editState;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.title;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.lastName;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.firstName;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.yearOfRelease;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.pageCount;
import static main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame.rating;

public class EditBookTextfieldContent {

    private BookModel bookModel;
    public BookModelList bookModelList;
    public JTable jTable;

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

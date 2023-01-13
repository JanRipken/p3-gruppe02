package main.tomedb.java.newbookframe.controller;

import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.AutorName;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.AutorVorName;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.Erscheinungsjahr;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.Seitenanzahl;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.bewertung;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.titel;
import static main.tomedb.java.newbookframe.controller.NewBookOrEditBookState.editState;

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
            titel.setText(bookModel.getTitle());
            AutorName.setText(bookModel.getAuthorLastName());
            AutorVorName.setText(bookModel.getAuthorFirstName());
            Erscheinungsjahr.setText(Integer.toString(bookModel.getYearOfRelease()));
            Seitenanzahl.setText(Integer.toString(bookModel.getPageCount()));
            bewertung.setText(Double.toString(bookModel.getRating()));
        }
    }
}

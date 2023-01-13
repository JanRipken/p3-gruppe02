package main.tomedb.java.newbookframe.controller;

import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import static main.tomedb.java.newbookframe.controller.NewOrEdit.newOrEdit;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.AutorName;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.AutorVorName;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.Erscheinungsjahr;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.Seitenanzahl;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.bewertung;
import static main.tomedb.java.newbookframe.view.NewOrEditFrame.titel;

public class NewOrEditContent {

    private BookModel model;
    public BookModelList list;
    public JTable table;

    public void NewOrEditContent() {
        if (newOrEdit == 0) {
            this.list = Table.bookModelList;
            this.table = MainPanel.table.jTable;
            int[] bookIndex = table.getSelectedRows();
            this.model = list.getBook(bookIndex[0]);
            titel.setText(model.getTitle());
            AutorName.setText(model.getAuthorLastName());
            AutorVorName.setText(model.getAuthorFirstName());
            Erscheinungsjahr.setText(Integer.toString(model.getYearOfRelease()));
            Seitenanzahl.setText(Integer.toString(model.getPageCount()));
            bewertung.setText(Double.toString(model.getRating()));
        }
    }
}

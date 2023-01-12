package main.tomedb.java.newbookframe.controller;

import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import static main.tomedb.java.newbookframe.controller.NewOrEdit.newOrEdit;
import static main.tomedb.java.newbookframe.view.NewBook.AutorName;
import static main.tomedb.java.newbookframe.view.NewBook.AutorVorName;
import static main.tomedb.java.newbookframe.view.NewBook.Erscheinungsjahr;
import static main.tomedb.java.newbookframe.view.NewBook.Seitenanzahl;
import static main.tomedb.java.newbookframe.view.NewBook.bewertung;
import static main.tomedb.java.newbookframe.view.NewBook.titel;

public class NewOrEditContent {

    private BookModel model;
    public BookModelList list;
    public JTable table;

    public void NewOrEditContent() {
        if (newOrEdit == 1) {
            titel.setText("Musterbuch");
            AutorName.setText("Mustername");
            AutorVorName.setText("Mustervorname");
            Erscheinungsjahr.setText("2023");
            Seitenanzahl.setText("123");
            bewertung.setText("9.9");
        } else {
            this.list = Table.list;
            this.table = MainPanel.jListTable.table;
            int[] bookIndex = table.getSelectedRows();
            this.model = list.get(bookIndex[0]);
            titel.setText(model.getTitle());
            AutorName.setText(model.getAuthorLastName());
            AutorVorName.setText(model.getAuthorFirstName());
            Erscheinungsjahr.setText(Integer.toString(model.getYearOfRelease()));
            Seitenanzahl.setText(Integer.toString(model.getPageCount()));
            bewertung.setText(Double.toString(model.getRating()));
        }
    }
}

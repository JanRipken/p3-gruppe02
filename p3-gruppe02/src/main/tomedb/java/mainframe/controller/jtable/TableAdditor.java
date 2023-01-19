package main.tomedb.java.mainframe.controller.jtable;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;

public class TableAdditor {

    public static BookModelList bookModelList;
    public JTable jTable;
    public DefaultTableModel defaultTableMode;

    public TableAdditor(JTable jTable, DefaultTableModel defaultTableModel, BookModelList bookModelList) {
        this.jTable = jTable;
        this.defaultTableMode = defaultTableModel;
        this.bookModelList = bookModelList;
    }

    public void addToTable(BookModel book) {
        bookModelList.addBook(book);
        rebuildTableRows();
    }

    public void editToTable() {
        rebuildTableRows();
    }

    public void rebuildTableRows() {
        defaultTableMode.setRowCount(0);

        for (int i = 0; i < bookModelList.bookModelArrayList.size(); i++) {

            Object[] data = {bookModelList.bookModelArrayList.get(i).getTitle(),
                bookModelList.bookModelArrayList.get(i).getAuthorLastName(),
                bookModelList.bookModelArrayList.get(i).getAuthorFirstName(),
                bookModelList.bookModelArrayList.get(i).getYearOfRelease(),
                bookModelList.bookModelArrayList.get(i).getPageCount(),
                bookModelList.bookModelArrayList.get(i).getRating(),
                bookModelList.bookModelArrayList.get(i).getReadStatus()};
            defaultTableMode.addRow(data);

        }
    }
}

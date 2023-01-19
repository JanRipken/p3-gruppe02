package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.title;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.lastName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.firstName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.yearOfRelease;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.pageCount;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.rating;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.readStatus;

public class EditBookAction implements ActionListener {

    private JTable table;
    private BookModelList list;
    private BookModel book;

    @Override
    public void actionPerformed(ActionEvent e) {

        editSelectedBook();

    }

    private void editSelectedBook() {
        this.table = MainPanel.table.jTable;
        this.list = MainPanel.table.bookModelList;

        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
        int modelIndex = table.convertRowIndexToModel(selectedRow);
        book = list.getBook(modelIndex);

       
        showEdit();
             
    }

    private void showEdit() {
        
        new NewOrEditBookFrame(book);
        title.setText(book.getTitle());
        lastName.setText(book.getAuthorLastName());
        firstName.setText(book.getAuthorFirstName());
        yearOfRelease.setText(Integer.toString(book.getYearOfRelease()));
        pageCount.setText(Integer.toString(book.getPageCount()));
        rating.setText(Double.toString(book.getRating()));
        readStatus.setSelected(book.getReadStatus());
        

    }

}

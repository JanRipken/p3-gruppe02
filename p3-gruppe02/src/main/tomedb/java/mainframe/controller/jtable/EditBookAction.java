package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.title;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.lastName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.firstName;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.yearOfRelease;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.pageCount;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.rating;
import static main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame.readStatus;

public class EditBookAction implements ActionListener {

    private JTable jTable;
    private BookModelList bookModelList;
    private BookModel bookModel;

    @Override
    public void actionPerformed(ActionEvent e) {

        editSelectedBook();
    }

    private void editSelectedBook() {
        this.jTable = MainPanel.table.jTable;
        this.bookModelList = MainPanel.table.bookModelList;

        int selectedRow = jTable.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
        int modelIndex = jTable.convertRowIndexToModel(selectedRow);
        bookModel = bookModelList.getBook(modelIndex);

       
        showEdit();
    }

    private void showEdit() {
        
        new NewOrEditBookFrame(bookModel);
        title.setText(bookModel.getTitle());
        lastName.setText(bookModel.getAuthorLastName());
        firstName.setText(bookModel.getAuthorFirstName());
        yearOfRelease.setText(Integer.toString(bookModel.getYearOfRelease()));
        pageCount.setText(Integer.toString(bookModel.getPageCount()));
        rating.setText(Double.toString(bookModel.getRating()));
        readStatus.setSelected(bookModel.getReadStatus());
    }
}

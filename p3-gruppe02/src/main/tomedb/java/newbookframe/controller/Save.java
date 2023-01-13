package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewOrEditFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.newbookframe.view.InputTitel;
import static main.tomedb.java.newbookframe.controller.NewOrEdit.newOrEdit;
// Klasse zum speichern eines neuen Buches

public class Save implements ActionListener {

    private NewOrEditFrame view;
    private BookModel model;
    public BookModelList list;
    public JTable table;

    public Save(NewOrEditFrame view) {
        if (newOrEdit == 1) {
            this.model = new BookModel();
            this.view = view;
        } else {
            this.list = Table.bookModelList;
            this.table = MainPanel.table.jTable;
            int[] bookIndex = table.getSelectedRows();
            this.model = list.getBook(bookIndex[0]);
            this.view = view;

        }

    }

    public void setModel() {

        model.setTitle(view.getTitel());
        model.setAuthorLastName(view.getAutorName());
        model.setAuthorFirstName(view.getAutorVorname());
        model.setYearOfRelease(view.getErscheinungsjahr());
        model.setPageCount(view.getSeitenzahl());
        model.setRating(view.getbewertung());
        model.setReadStatus(view.getNochmallesen());

    }

    public void setModelEdit() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (view.getTitel().equals("")) {
                new InputTitel();

            } else {
                setModel();
                if (newOrEdit == 1) {
                    MainPanel.table.addToTable(model);
                    
                } else {
                    MainPanel.table.editToTable(model);
                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}

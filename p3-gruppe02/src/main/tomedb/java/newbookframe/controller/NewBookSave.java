package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewBook;
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

public class NewBookSave implements ActionListener {

    private NewBook view;
    private BookModel model;
    public BookModelList list;
    public JTable table;

    public NewBookSave(NewBook view) {
        if (newOrEdit == 1) {
            this.model = new BookModel();
            this.view = view;
        } else {
            this.list = Table.list;
            this.table = MainPanel.JlistTabelle.table;
            int[] bookIndex = table.getSelectedRows();
            this.model = list.get(bookIndex[0]);
            this.view = view;

        }

    }

    public void setModel() {

        model.setTitel(view.getTitel());
        model.setAutorName(view.getAutorName());
        model.setAutorVorname(view.getAutorVorname());
        model.setErscheinungsjahr(view.getErscheinungsjahr());
        model.setSeitenanzahl(view.getSeitenzahl());
        model.setBewerung(view.getbewertung());
        model.setGelesen(view.getNochmallesen());

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
                    MainPanel.JlistTabelle.addToTable(model);
                } else {
                    MainPanel.JlistTabelle.addEditToTable(model);
                }
                view.dispose();
            }

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}

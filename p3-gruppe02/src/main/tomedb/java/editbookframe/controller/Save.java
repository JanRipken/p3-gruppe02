package main.tomedb.java.editbookframe.controller;

import main.tomedb.java.editbookframe.view.EditBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.newbookframe.view.InputTitel;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;

public class Save implements ActionListener {

    private EditBook view;
    private BookModel model;
    public BookModelList list;
    public JTable table;

    public Save(EditBook view) {
        this.list = Table.list;
        this.table = MainPanel.JlistTabelle.table;
        int[] bookIndex = table.getSelectedRows();
        this.model = list.get(bookIndex[0]);
        this.view = view;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (view.getTitel().equals("")) {
                new InputTitel();

            } else {
                setModel();
                MainPanel.JlistTabelle.addEditToTable(model);
                view.dispose();
            }

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}

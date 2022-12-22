package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.newbookframe.view.InputTitel;


// Klasse zum speichern eines neuen Buches
public class Save implements ActionListener {

    private NewBook view;
    private BookModel model;

    public Save(NewBook view) {
        this.model = new BookModel();
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
                MainPanel.JlistTabelle.addToTable(model);
                view.dispose();
            }

        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

}

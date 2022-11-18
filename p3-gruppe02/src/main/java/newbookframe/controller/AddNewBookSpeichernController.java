package main.java.newbookframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.mainframe.model.BookModel;
import main.java.newbookframe.view.AddNewBook;
import main.java.newbookframe.view.AddNewBookPopUpView;
import main.java.mainframe.view.SouthPanel;

// Klasse zum speichern eines neuen Buches
public class AddNewBookSpeichernController implements ActionListener {

    private AddNewBook view;
    private BookModel model;

    public AddNewBookSpeichernController(AddNewBook view) {
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
            setModel();
            SouthPanel.JlistTabelle.addToTable(model);
            view.dispose();

        } catch (Exception ex) {
            AddNewBookPopUpView pop = new AddNewBookPopUpView();
        }

    }

}

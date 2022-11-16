package controller.AddNewBookControll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BookModel;
import view.AddNewBookFrames.AddNewBook;
import view.AddNewBookFrames.AddNewBookPopUpView;
import view.MainFrames.SouthPanel;

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

            SouthPanel.JlistTabelle.addToList(model);

            view.dispose();

        } catch (Exception ex) {
            
            AddNewBookPopUpView pop = new AddNewBookPopUpView();
        }

    }

}

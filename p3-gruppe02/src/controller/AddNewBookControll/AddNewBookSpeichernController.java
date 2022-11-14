
package controller.AddNewBookControll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BookModel;
import view.AddNewBookFrames.AddNewBook;


public class AddNewBookSpeichernController implements ActionListener {
    private AddNewBook view;
    private BookModel model;
   
    
   
    
    public AddNewBookSpeichernController(AddNewBook view){
        this.model = new BookModel();
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            model.setTitel(view.getTitel());
            model.setAutorName(view.getAutorName());
            model.setAutorVorname(view.getAutorVorname());
            model.setErscheinungsjahr(view.getErscheinungsjahr());
            model.setSeitenanzahl(view.getSeitenzahl());
            model.setBewerung(view.getbewertung());
            model.setGelesen(view.getNochmallesen());
            
            // Nur testweise
            // In konsole schreiben
            System.out.println(view.getTitel());
            System.out.println(view.getAutorName());
            System.out.println(view.getAutorVorname());
            System.out.println(view.getErscheinungsjahr());
            System.out.println(view.getSeitenzahl());
            System.out.println(view.getbewertung());
            System.out.println(view.getNochmallesen());
            
            view.dispose();
        }
        catch (Exception ex){
         System.out.println("Fehler:"+ ex);
        }
        
       
    }
    
    

   
    
    
}

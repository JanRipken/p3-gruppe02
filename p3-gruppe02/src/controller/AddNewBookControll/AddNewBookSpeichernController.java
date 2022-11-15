
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
            System.out.println(model.getTitel());
            System.out.println(model.getAutorName());
            System.out.println(model.getAutorVorname());
            System.out.println(model.getErscheinungsjahr());
            System.out.println(model.getSeitenanzahl());
            System.out.println(model.getBewertung());
            System.out.println(model.getGelesen());
            
            view.dispose();
        }
        catch (Exception ex){
         System.out.println("Fehler:"+ ex);
        }
        
       
    }
    
    

   
    
    
}

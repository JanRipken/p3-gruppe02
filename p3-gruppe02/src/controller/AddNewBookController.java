
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BookModel;
import view.AddNewBookFrames.AddNewBook;


public class AddNewBookController implements ActionListener {
    private AddNewBook view;
    private BookModel model;
   
    
   
    
    public AddNewBookController(AddNewBook view){
        this.model = new BookModel();
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            //model.setTitel(view.getTitel());
            System.out.println(view.getTitel());
            System.out.println(view.getAutorName());
            System.out.println(view.getAutorVorname());
            System.out.println(view.getErscheinungsjahr());
            System.out.println(view.getSeitenzahl());
            System.out.println(view.getNochmallesen());
        }
        catch (Exception ex){
         System.out.println("Fehler:"+ ex);
        }
        
       
    }
    
    

   
    
    
}

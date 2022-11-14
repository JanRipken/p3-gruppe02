
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BookModel;
import view.AddNewBook;


public class AddNewBookController implements ActionListener {
    private AddNewBook view;
    private BookModel model;
   
    
   
    
    public AddNewBookController(AddNewBook view){
        this.model = new BookModel();
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        this.model.setAutorName("Hallo");
        
       
    }
    
    

   
    
    
}

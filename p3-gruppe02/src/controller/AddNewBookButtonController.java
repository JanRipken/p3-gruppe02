
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import view.AddNewBook;
import view.MainFrame;


public class AddNewBookButtonController implements ActionListener {
   

    private MainFrame.NorthPanel viewMainFrameAddNewButtonController;
    private AddNewBook.BestätigenOderAbbrechenPanel controllerAbbrechen;
    
    
    public AddNewBookButtonController(MainFrame.NorthPanel viewMainFrameAddNewButtonController){
        this.viewMainFrameAddNewButtonController = viewMainFrameAddNewButtonController;
       
    }
    
     public AddNewBookButtonController(AddNewBook.BestätigenOderAbbrechenPanel controllerAbbrechen){
        this.controllerAbbrechen = controllerAbbrechen;
              
    }



   

    @Override
    public void actionPerformed(ActionEvent e) {
            
            AddNewBook newBook = new AddNewBook();
            
            
            
            
            
            
    }
    
    
}

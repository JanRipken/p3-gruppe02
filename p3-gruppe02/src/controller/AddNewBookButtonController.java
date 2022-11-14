
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
    private String ButtonName;

    
    
    public AddNewBookButtonController(MainFrame.NorthPanel viewMainFrameAddNewButtonController, String namendesButtons){
        this.viewMainFrameAddNewButtonController = viewMainFrameAddNewButtonController;
        this.ButtonName = namendesButtons;
       
    }
    
     public AddNewBookButtonController(AddNewBook.BestätigenOderAbbrechenPanel controllerAbbrechen, String namendesButtons){
        this.controllerAbbrechen = controllerAbbrechen;
        this.ButtonName = namendesButtons;
    }



   

    @Override
    public void actionPerformed(ActionEvent e) {
            
            if(ButtonName == "AddNewBook"){
             AddNewBook newBook = new AddNewBook();
            }
            
            if(ButtonName == "ButtonAbrechenAbbrechen"){
               
            }
            
                
             
    }
    
    
}

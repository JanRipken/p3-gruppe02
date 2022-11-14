
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.SwingUtilities;
import view.AddNewBookFrames.AddNewBook;
import view.MainFrame;


public class AddNewBookButtonController implements ActionListener {
   

    private MainFrame.NorthPanel viewMainFrameAddNewButtonController;
    private AddNewBook controllerAbbrechen;
    private String ButtonName;

    
    
    public AddNewBookButtonController(MainFrame.NorthPanel viewMainFrameAddNewButtonController, String namendesButtons){
        this.viewMainFrameAddNewButtonController = viewMainFrameAddNewButtonController;
        this.ButtonName = namendesButtons;
       
    }
    
     public AddNewBookButtonController(AddNewBook controllerAbbrechen, String namendesButtons){
        this.controllerAbbrechen = controllerAbbrechen;
        this.ButtonName = namendesButtons;
    }



   

    @Override
    public void actionPerformed(ActionEvent e) {
            
            if(ButtonName == "AddNewBook"){
             
                SwingUtilities.invokeLater(new Runnable() {
                    public void run(){
                        try{
                             AddNewBook newBook = new AddNewBook();
                        }
                        catch(Exception e){
                             e.printStackTrace();
                         }
                    }
                });
                
            }
            
            if(ButtonName == "ButtonAbrechenAbbrechen"){
               
            }
            
                
             
    }
    
    
}

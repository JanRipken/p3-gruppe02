
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNewBook;
import view.MainFrame;


public class AddNewBookButtonController implements ActionListener {
    private MainFrame.NorthPanel viewMainFrameAddNewButtonController;
    
    
    public AddNewBookButtonController(MainFrame.NorthPanel viewMainFrameAddNewButtonController){
        this.viewMainFrameAddNewButtonController = viewMainFrameAddNewButtonController;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      AddNewBook newBook = new AddNewBook();
    }
    
    
}

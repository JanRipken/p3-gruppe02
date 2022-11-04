
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNewBook;
import view.MainFrame;


public class MainFrameController implements ActionListener {
    private MainFrame.NorthPanel viewMainFrameNorth;
    
    
    public MainFrameController(MainFrame.NorthPanel viewMainFrameNorth){
        this.viewMainFrameNorth = viewMainFrameNorth;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      AddNewBook newBook = new AddNewBook();
    }
    
    
}

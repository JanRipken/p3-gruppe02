
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNewBook;
import view.MainFrame;


public class MainFrameNorthController implements ActionListener {
    private MainFrame.NorthPanel viewMainFrameNorth;
    
    
    public MainFrameNorthController(MainFrame.NorthPanel viewMainFrameNorth){
        this.viewMainFrameNorth = viewMainFrameNorth;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      AddNewBook newBook = new AddNewBook();
    }
    
    
}

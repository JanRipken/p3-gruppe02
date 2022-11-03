
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNewBook;
import view.MainFrame;


public class MainFrameController implements ActionListener {
    private MainFrame.NorthPanel viewMain;
    
    
    public MainFrameController(MainFrame.NorthPanel viewMain){
        this.viewMain = viewMain;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      AddNewBook newBook = new AddNewBook();
    }
    
    
}

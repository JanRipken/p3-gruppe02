
package controller.AddNewBookControll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.SwingUtilities;
import view.AddNewBookFrames.AddNewBook;
import view.MainFrames.MainFrame;


public class AddNewBookMainController implements ActionListener {
   
    private view.MainFrames.NorthPanel view;
    //private MainFrame.NorthPanel view;
    private AddNewBook controllerAbbrechen;

    
    
    public AddNewBookMainController(view.MainFrames.NorthPanel view){
        this.view = view;
        
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
            
             
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
}

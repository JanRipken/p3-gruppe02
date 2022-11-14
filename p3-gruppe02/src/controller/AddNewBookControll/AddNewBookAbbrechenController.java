
package controller.AddNewBookControll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddNewBookFrames.AddNewBook;


public class AddNewBookAbbrechenController implements ActionListener{
    private AddNewBook view;
    
    public AddNewBookAbbrechenController(AddNewBook view){
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       view.dispose();;
    }
    
}


package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import view.AddNewBook;





public class TextfieldInputController implements ActionListener {

    private AddNewBook.LayoutAddBook controllerAddBook;
    private JTextField textfield;
    
    public TextfieldInputController(AddNewBook.LayoutAddBook controllerAddBook, JTextField field){
        this.controllerAddBook = controllerAddBook;
        this.textfield = field;
     
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(textfield.getText());
    
    }
    
}

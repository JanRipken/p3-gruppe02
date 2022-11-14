
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.BookModel;
import view.AddNewBook;





public class TextfieldInputController implements ActionListener {

    private AddNewBook.LayoutAddBook controllerAddBook;
    private JTextField textfield;
    private AddNewBook.LayoutAddBook view;
    private BookModel model;
    
    public TextfieldInputController(AddNewBook.LayoutAddBook controllerAddBook, JTextField field){
        this.controllerAddBook = controllerAddBook;
        this.textfield = field;
        this.model = model;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setTitel("Musterman");
        model.setAutorName("Max");
        model.setSeitenanzahl(19);
        model.setGelesen(true);
        model.setBewerung(10);
        model.setErscheinungsjahr(2021);
    }
    
    
    
}

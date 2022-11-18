package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.AddNewBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Klasse um das Frame zum erstellen eines neuen Buches zu schlissen 
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

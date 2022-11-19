package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Klasse um das Frame zum erstellen eines neuen Buches zu schlissen 
public class Abort implements ActionListener{
    private NewBook view;
    
    public Abort(NewBook view){
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       view.dispose();;
    }
    
}

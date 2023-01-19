package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.main.model.BookModel;
import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;

public class NewBookAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        new NewOrEditBookFrame(new BookModel());
    }
}

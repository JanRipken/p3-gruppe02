package main.java.newbookframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import main.java.mainframe.model.BookModelList;
import main.java.newbookframe.view.AddNewBook;

//Klasse zum starten der UI zum erstellen eines Neuen Buches
public class AddNewBookMainController implements ActionListener {

    private main.java.mainframe.view.NorthPanel view;
    BookModelList modelBook;

    public AddNewBookMainController(main.java.mainframe.view.NorthPanel view) {
        this.view = view;
        modelBook = new BookModelList();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddNewBook newBook = new AddNewBook();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

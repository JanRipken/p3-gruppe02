package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.view.SouthPanel;

public class JTableActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        //Funktioniert nicht, bekomme nicht den richtigen index raus
        
        Table.list.deleteBook(e);
        System.out.println("del");
        SouthPanel.JlistTabelle.addRowtoTable();

    }

}

package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.editbookframe.view.EditBook;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;

import main.tomedb.java.newbookframe.view.NewBook;

public class JTableActionListenerEdit extends EditBook implements ActionListener {

    public JTable table;
    public DefaultTableModel model;
    public BookModelList list;
    public JMenuItem menuItemRemove;
    public JMenuItem menuItemEdit;
    BookModelList modelBook;

    @Override
    public void actionPerformed(ActionEvent e) {
         editCurrentRows();
         //throw new UnsupportedOperationException("Not supported yet.");
         
    }
    
    // TODO: View.NewBook und dazugehörige clonen und auf EditBook anpassen
    // methode so nicht verwenden
    private void editCurrentRows()  {
        this.model = MainPanel.JlistTabelle.model;
        this.table = MainPanel.JlistTabelle.table;
        this.list = MainPanel.JlistTabelle.list;

        // Indizes der Gewählten Zeilen werden in ein Array gelesen
        int[] bookIndex = table.getSelectedRows();
        //new main.tomedb.java.newbookframe.view.NewBook();
        list.editBook(bookIndex[0], list.get(bookIndex[0]));
        
        NewBook.titel.setText("test");
        NewBook.AutorName.setText("Musterman");
        NewBook.AutorVorName.setText("Max");
        NewBook.Erscheinungsjahr.setText("2021");
        NewBook.Seitenanzahl.setText("3019");
        NewBook.bewertung.setText("7.2");
        
        
    }

}

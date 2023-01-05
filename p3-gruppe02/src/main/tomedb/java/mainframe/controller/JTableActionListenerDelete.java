package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;

import main.tomedb.java.mainframe.view.Table;

public class JTableActionListenerDelete implements ActionListener {

    public JTable table;
    public DefaultTableModel model;
    public BookModelList list;
    public JMenuItem menuItemRemove;
    public JMenuItem menuItemEdit;

    @Override
    public void actionPerformed(ActionEvent e) {

        removeSelectedRows();

    }

    public void removeSelectedRows() {

        this.model = MainPanel.JlistTabelle.model;
        this.table = MainPanel.JlistTabelle.table;
        this.list = Table.list;

        // Indizes der Gewählten Zeilen werden in ein Array gelesen und anschließend gelöscht
        int[] bookIndex = table.getSelectedRows();

        for (int i = 0; bookIndex.length - 1 >= i; i++) {
            System.out.println(bookIndex[0]);
            list.deleteBook(bookIndex[0]);
            model.removeRow(bookIndex[0]);
        }
    }
}

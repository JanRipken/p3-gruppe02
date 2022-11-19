package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.tomedb.java.mainframe.view.SouthPanel;

public class JTableSearch implements ActionListener {

    TableRowSorter<DefaultTableModel> sorter;
    public JTable table;
    public DefaultTableModel model;
    String suchBegriff;

    // Anwenden des such Filters 
    public void search() {
        if (suchBegriff != null) {
            sorter.setRowFilter(RowFilter.regexFilter(suchBegriff));
        }
    }

    // erstellen der Internen JTable methode Sorter
    private void createRowSorter(DefaultTableModel model) {
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(sorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        main.tomedb.java.mainframe.view.TableSearch searching = new main.tomedb.java.mainframe.view.TableSearch();
        suchBegriff = searching.text;

        this.model = SouthPanel.JlistTabelle.model;
        this.table = SouthPanel.JlistTabelle.table;

        createRowSorter(model);

        // Aufrufen der such Methode
        search();
    }
}

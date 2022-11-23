package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.tomedb.java.mainframe.view.SouthPanel;
import main.tomedb.java.mainframe.view.TableSearch;

public class JTableSearch implements ActionListener {

    private TableRowSorter<DefaultTableModel> sorter;
    private JTable table;
    private DefaultTableModel model;
    private String searchTerm;

    /**
     * Using the Regex filter to search for Regular expressions in our JTable with
     * whatever search the user Wants
     */
    public void search() {
        if (searchTerm != null) {
            sorter.setRowFilter(RowFilter.regexFilter(searchTerm));
        }
    }

    private void createRowSorter(DefaultTableModel model) {
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(sorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TableSearch searching = new TableSearch();
        searchTerm = searching.text;

        this.model = SouthPanel.JlistTabelle.model;
        this.table = SouthPanel.JlistTabelle.table;

        createRowSorter(model);

        search();
    }
}

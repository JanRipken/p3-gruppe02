package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.TableSearchPanel;

public class SearchAction implements ActionListener {

    private TableRowSorter<DefaultTableModel> tableRowSorter;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private String searchTerm;

    /**
     * Methode zum setzen eines filters welcher case insensitive ist mithilfe des ?! Regex Patterns
     */
    private void search() {
        if (searchTerm != null) {
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTerm);
            tableRowSorter.setRowFilter(rowFilter);
        }
    }

    private void createRowSorter(DefaultTableModel defaultTableModel) {
        tableRowSorter = new TableRowSorter<DefaultTableModel>(defaultTableModel);
        jTable.setRowSorter(tableRowSorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TableSearchPanel tableSearchPanel = new TableSearchPanel();
        searchTerm = tableSearchPanel.searchTerm;

        this.defaultTableModel = MainPanel.table.defaultTableMode;
        this.jTable = MainPanel.table.jTable;

        createRowSorter(defaultTableModel);

        search();
    }
}
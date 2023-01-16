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

    private TableRowSorter<DefaultTableModel> sorter;
    private JTable table;
    private DefaultTableModel model;
    private String searchTerm;

    /**
     * Methode zum setzen eines filters welcher case insensitive ist mithilfe des ?! Regex Patterns
     */
    private void search() {
        if (searchTerm != null) {
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTerm);
            sorter.setRowFilter(rowFilter);
        }
    }

    private void createRowSorter(DefaultTableModel model) {
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(sorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TableSearchPanel tableSearchPanel = new TableSearchPanel();
        searchTerm = tableSearchPanel.searchTerm;

        this.model = MainPanel.table.defaultTableMode;
        this.table = MainPanel.table.jTable;

        createRowSorter(model);

        search();
    }
}
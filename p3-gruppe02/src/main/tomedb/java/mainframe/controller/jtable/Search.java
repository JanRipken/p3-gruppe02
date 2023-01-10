package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.view.TableSearch;

public class Search implements ActionListener {

    private TableRowSorter<DefaultTableModel> sorter;
    private JTable table;
    private DefaultTableModel model;
    private String searchTerm;
    public BookModelList list;
    
    public void search() {
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
        TableSearch searching = new TableSearch();
        searchTerm = searching.text;

        this.model = MainPanel.JlistTabelle.model;
        this.table = MainPanel.JlistTabelle.table;
        this.list = Table.list;

        createRowSorter(model);

        search();
    }
}

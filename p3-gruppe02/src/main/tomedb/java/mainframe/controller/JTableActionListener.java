package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.view.SouthPanel;
import static main.tomedb.java.mainframe.view.Table.list;

public class JTableActionListener implements ActionListener {

    public JTable table;
    public DefaultTableModel model;

    //TODO work in progress
    @Override
    public void actionPerformed(ActionEvent e) {

        removeCurrentRow();

    }

    private void removeCurrentRow() {

        this.model = SouthPanel.JlistTabelle.model;
        this.table = SouthPanel.JlistTabelle.table;

        int selectedRow = table.getSelectedRow();

        String col1 = (String) table.getValueAt(selectedRow, 0);

        System.out.println(col1);

        model.removeRow(selectedRow);

    }
}

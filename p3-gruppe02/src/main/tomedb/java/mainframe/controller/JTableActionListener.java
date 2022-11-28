package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.view.SouthPanel;

public class JTableActionListener implements ActionListener {

    public JTable table;
    public DefaultTableModel model;

    @Override
    public void actionPerformed(ActionEvent e) {

        //Funktioniert nicht, bekomme nicht den richtigen index raus
        removeCurrentRow();

    }

    private void removeCurrentRow() {
        System.out.println("del");
        this.model = SouthPanel.JlistTabelle.model;

        this.table = SouthPanel.JlistTabelle.table;
        int selectedRow = table.getSelectedRow();
        model.removeRow(selectedRow);

    }
}

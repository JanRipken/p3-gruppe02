package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;

public class DeleteBookAction implements ActionListener {

    private JTable table;
    private DefaultTableModel model;
    private BookModelList list;

    @Override
    public void actionPerformed(ActionEvent e) {
        removeSelectedRows();
    }

    private void removeSelectedRows() {
        this.model = MainPanel.table.defaultTableMode;
        this.table = MainPanel.table.jTable;
        this.list = MainPanel.table.bookModelList;

        int[] selectedRows = table.getSelectedRows();

        for (int i = 0; selectedRows.length - 1 >= i; i++) {
            int modelIndex = table.convertRowIndexToModel(selectedRows[0]);

            list.deleteBook(modelIndex);
            model.removeRow(modelIndex);
        }
    }
}

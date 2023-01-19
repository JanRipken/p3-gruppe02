package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;

public class DeleteBookAction implements ActionListener {

    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private BookModelList bookModelList;

    @Override
    public void actionPerformed(ActionEvent e) {
        removeSelectedRows();
    }

    private void removeSelectedRows() {
        this.defaultTableModel = MainPanel.table.defaultTableMode;
        this.jTable = MainPanel.table.jTable;
        this.bookModelList = MainPanel.table.bookModelList;

        int[] selectedRows = jTable.getSelectedRows();

        for (int i = 0; selectedRows.length - 1 >= i; i++) {
            int modelIndex = jTable.convertRowIndexToModel(selectedRows[0]);

            bookModelList.deleteBook(modelIndex);
            defaultTableModel.removeRow(modelIndex);
        }
    }
}

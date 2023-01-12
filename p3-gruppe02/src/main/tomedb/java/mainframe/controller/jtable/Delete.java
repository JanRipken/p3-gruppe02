package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;

public class Delete implements ActionListener {

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
        this.model = MainPanel.jListTable.model;
        this.table = MainPanel.jListTable.table;
        this.list = Table.list;

        int[] bookIndex = table.getSelectedRows();

        for (int i = 0; bookIndex.length - 1 >= i; i++) {
            System.out.println(bookIndex[0]);
            list.deleteBook(bookIndex[0]);
            model.removeRow(bookIndex[0]);
        }
    }
}

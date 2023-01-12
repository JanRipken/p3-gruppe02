package main.tomedb.java.mainframe.controller.menubar.showhide;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.menubar.HideColumns;

public class ColumnShowHide implements ActionListener {

    private JCheckBox checkBox;
    private JTable table;

    public ColumnShowHide(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.table = MainPanel.jListTable.table;
        showHide(getColumn(e));
    }

    private void showHide(TableColumn column) {
        if (checkBox.isSelected()) {
            column.setMinWidth(0);
            column.setMaxWidth(0);
            column.setPreferredWidth(0);
        } else {
            column.setMinWidth(50);
            column.setMaxWidth(900);
            column.setPreferredWidth(150);
        }
    }

    private TableColumn getColumn(ActionEvent e) {
        if (e.getSource() == HideColumns.titleCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(0);
            return column;
        } else if (e.getSource() == HideColumns.authorLastNameCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(1);
            return column;
        } else if (e.getSource() == HideColumns.authorFirstNameCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(2);
            return column;
        } else if (e.getSource() == HideColumns.yearOfReleaseCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(3);
            return column;
        } else if (e.getSource() == HideColumns.pageCountCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(4);
            return column;
        } else if (e.getSource() == HideColumns.ratingCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(5);
            return column;
        } else if (e.getSource() == HideColumns.readStatusCheckBox) {
            TableColumn column = table.getColumnModel().getColumn(6);
            return column;
        } else {
            return null;
        }
    }
}

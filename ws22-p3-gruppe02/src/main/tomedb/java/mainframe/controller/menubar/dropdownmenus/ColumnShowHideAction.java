package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.menubar.BuildHideColumnsDropDownMenu;

public class ColumnShowHideAction implements ActionListener {

    private final JCheckBox checkBox;
    private JTable jTable;

    public ColumnShowHideAction(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.jTable = MainPanel.table.jTable;
        showHide(getColumn(e));
    }

    private void showHide(TableColumn tableColumn) {
        if (checkBox.isSelected()) {
            tableColumn.setMinWidth(0);
            tableColumn.setMaxWidth(0);
            tableColumn.setPreferredWidth(0);
        } else {
            tableColumn.setMinWidth(50);
            tableColumn.setMaxWidth(900);
            tableColumn.setPreferredWidth(150);
        }
    }

    private TableColumn getColumn(ActionEvent e) {
        if (e.getSource() == BuildHideColumnsDropDownMenu.titleCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(0);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.authorLastNameCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(1);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.authorFirstNameCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(2);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.yearOfReleaseCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(3);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.pageCountCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(4);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.ratingCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(5);
            return tableColumn;
        } else if (e.getSource() == BuildHideColumnsDropDownMenu.readStatusCheckBox) {
            TableColumn tableColumn = jTable.getColumnModel().getColumn(6);
            return tableColumn;
        } else {
            return null;
        }
    }
}

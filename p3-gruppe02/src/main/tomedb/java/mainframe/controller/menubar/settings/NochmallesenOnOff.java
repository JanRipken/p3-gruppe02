package main.tomedb.java.mainframe.controller.menubar.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.SouthPanel;
import main.tomedb.java.mainframe.view.Table;

public class NochmallesenOnOff implements ActionListener {

    private JCheckBox checkBox;
    private JTable table;

    public NochmallesenOnOff(JCheckBox checkBox) {
        this.checkBox = checkBox;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hidenomalLesen();
    }

    private void hidenomalLesen() {
        this.table = SouthPanel.JlistTabelle.table;

        TableColumn column = table.getColumnModel().getColumn(6);
        System.out.println(checkBox.isSelected());
        if (checkBox.isSelected()) {

    column.setMinWidth(0);
    column.setMaxWidth(0);
    column.setPreferredWidth(0);
            
        }

        if (checkBox.isSelected() == false) {
            
    column.setMinWidth(50);
    column.setMaxWidth(100);
    column.setPreferredWidth(200);
    //        table.revalidate();
    //        table.repaint();
        }

    }

}

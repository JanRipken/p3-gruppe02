package main.tomedb.java.mainframe.controller.menubar.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import main.tomedb.java.mainframe.view.SouthPanel;

public class SeitenanzahlOnOff implements ActionListener {

    private JCheckBox checkBox;
    private JTable table;

    public SeitenanzahlOnOff(JCheckBox checkBox) {
        this.checkBox = checkBox;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hidenomalLesen();
    }

private void hidenomalLesen() {
    this.table = SouthPanel.JlistTabelle.table;

    TableColumn column = table.getColumnModel().getColumn(4);
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

}

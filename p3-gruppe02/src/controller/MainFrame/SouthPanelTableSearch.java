package controller.MainFrame;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SouthPanelTableSearch implements ActionListener {

    TableRowSorter<DefaultTableModel> sorter;
    public JTable table;
    public DefaultTableModel model;

    // list statt table durchsuchen
    
    public SouthPanelTableSearch() {

    }

    public void search() {
        JPanel panel = new JPanel(new FlowLayout());
        JCheckBox cb = new JCheckBox("Selektive Suche");
        panel.add(cb);
        String text = JOptionPane.showInputDialog(panel);
        if (cb.isSelected()) {
            sorter.setRowFilter(RowFilter.regexFilter(text));
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    System.out.println(table.getValueAt(i, j));
                }
            }
        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    if (model.getValueAt(table.convertRowIndexToModel(i), table.convertColumnIndexToModel(j)).toString()
                            .indexOf(text) != -1) {
                        Rectangle r = table.getCellRect(i, 0, false);
                        table.scrollRectToVisible(r);
                        table.changeSelection(i, j, true, false);
                        for (int k = 0; k < table.getColumnCount(); k++) {
                            System.out.println(table.getValueAt(i, k));
                        }
                    }
                }
            }
        }
    }

    private void createRowSorter(DefaultTableModel model) {
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(sorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //createRowSorter(model);
        search();
    }
}

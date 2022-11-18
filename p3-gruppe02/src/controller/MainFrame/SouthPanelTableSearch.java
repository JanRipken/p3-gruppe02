package controller.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import view.MainFrames.SouthPanel;
import view.PopUpWindows.SouthPanelJTableSearch;

public class SouthPanelTableSearch implements ActionListener {

    TableRowSorter<DefaultTableModel> sorter;
    public JTable table;
    public DefaultTableModel model;
    String suchBegriff;
   

    // anwenden des Such Filters 
    public void search() {
        if (suchBegriff != null) {
                sorter.setRowFilter(RowFilter.regexFilter(suchBegriff));
            }
        }

    
    // erstellen der Internen JTable methode Sorter
    private void createRowSorter(DefaultTableModel model) {
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(sorter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SouthPanelJTableSearch searching = new SouthPanelJTableSearch();
        suchBegriff = searching.text;
 

        this.model = SouthPanel.JlistTabelle.model;
        this.table = SouthPanel.JlistTabelle.table;

        createRowSorter(model);
        search();

    }
}

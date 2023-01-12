package main.tomedb.java.mainframe.view;

import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TableSearchPanel {

    public String searchTerm;

    public TableSearchPanel() {

        JPanel panel = new JPanel(new GridLayout());

        searchTerm = JOptionPane.showInputDialog(panel,
                "Selektive Suche", "Eingabe",
                JOptionPane.PLAIN_MESSAGE);

    }
}

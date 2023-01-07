package main.tomedb.java.mainframe.view;

import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TableSearch {

    public String text;

    public TableSearch() {

        JPanel panel = new JPanel(new GridLayout());

        text = JOptionPane.showInputDialog(panel,
                "Selektive Suche", "Eingabe",
                JOptionPane.PLAIN_MESSAGE);

    }
}

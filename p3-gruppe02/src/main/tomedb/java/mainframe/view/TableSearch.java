/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class TableSearch {

    public String text;
    public JLabel label;

    public TableSearch() {
        
        JPanel panel = new JPanel(new GridLayout());
        
        text = JOptionPane.showInputDialog(panel,
                "Selektive Suche","Eingabe",
                JOptionPane.PLAIN_MESSAGE);

    }
}

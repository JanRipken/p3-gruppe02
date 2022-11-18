package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutAddBook extends JPanel {

    JTextField textfield = new JTextField();
    String beschreibung = new String();
    public LayoutAddBook(String myLabel) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        beschreibung = myLabel;
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(beschreibung));
        
        this.add(borderPanel);

    }
}

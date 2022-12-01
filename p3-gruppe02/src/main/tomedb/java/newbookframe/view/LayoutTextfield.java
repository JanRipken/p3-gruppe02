package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

//TODO in die main panel klasse packen 
public class LayoutTextfield extends JPanel {

    public JTextField textfield = new JTextField();
    String beschreibung = new String();

    public LayoutTextfield(String myLabel) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        beschreibung = myLabel;
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(beschreibung));

        this.add(borderPanel);

    }
}

package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

//TODO in die main panel klasse packen 
public class LayoutCheckBox extends JPanel {

    String beschreibung = new String();
    JCheckBox CB = new JCheckBox();

    public LayoutCheckBox(String myLabel) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        beschreibung = myLabel;
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(CB);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(beschreibung));

        this.add(borderPanel);

    }
}

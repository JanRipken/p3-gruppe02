/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
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

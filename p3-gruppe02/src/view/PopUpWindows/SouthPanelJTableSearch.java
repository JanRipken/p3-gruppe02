/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.PopUpWindows;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class SouthPanelJTableSearch {
    public String text;
public JLabel label;
    public SouthPanelJTableSearch(){
        JPanel panel = new JPanel(new GridLayout());
        
         label = new JLabel("Selektive Suche");
        panel.add(label);
        text = JOptionPane.showInputDialog(panel);
        
    }
}

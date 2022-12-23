/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.mainframe.TomeDB;

/**
 *
 * @author janri
 */
public class themeChange implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        String selectedItem = (String) comboBox.getSelectedItem();
        if (selectedItem == "Hell") {
            
       
            try {
                light();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(themeChange.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            System.out.println("Hell");
        }
        if (selectedItem == "Dunkel") {
            dark();
            
        }
    }

    private void light() throws IllegalAccessException {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  catch (ClassNotFoundException ex) {
                Logger.getLogger(themeChange.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(themeChange.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(themeChange.class.getName()).log(Level.SEVERE, null, ex);
            }

        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

    private void dark() {
        try {
            
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {

        }
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

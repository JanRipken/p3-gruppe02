/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.mainframe.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

/**
 *
 * @author janri
 */
public class SettingsAbort implements ActionListener {

    private LookAndFeel lookandfeel;

    public SettingsAbort(LookAndFeel lookAndFeel) {
        this.lookandfeel = lookAndFeel;
    }

    public void resetLookAndFeel() throws UnsupportedLookAndFeelException {
  
            UIManager.setLookAndFeel(lookandfeel);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            resetLookAndFeel();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SettingsAbort.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TomeDB.main.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

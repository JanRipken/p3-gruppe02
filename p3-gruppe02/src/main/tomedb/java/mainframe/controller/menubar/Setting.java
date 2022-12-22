/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.mainframe.view.SettingsPanel;


public class Setting implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        showSettingsPanel();
        //System.err.println("Not Supportet");
    }

    public void showSettingsPanel() {
        SettingsPanel panel = new SettingsPanel();

        TomeDB.main.add(panel);
        TomeDB.main.setContentPane(panel);
        TomeDB.main.revalidate();
        TomeDB.main.repaint();
        

    }

}

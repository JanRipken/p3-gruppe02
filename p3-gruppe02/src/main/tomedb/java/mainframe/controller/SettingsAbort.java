/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.mainframe.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;


/**
 *
 * @author janri
 */
public class SettingsAbort implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       TomeDB.main.setContentPane(mainPanel);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainFrames.JMenu.FileMenuBarSettings;

/**
 *
 * @author alex-
 */
public class NochmallesenOnOff implements ActionListener{

    public NochmallesenOnOff(FileMenuBarSettings aThis) {
    }
     
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Du hast Nochmal Lesen angeklickt");
            System.out.println(e.getActionCommand());
        }
    }
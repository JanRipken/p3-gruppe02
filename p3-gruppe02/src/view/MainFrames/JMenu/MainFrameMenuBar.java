/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author janri
 */
public class MainFrameMenuBar extends JMenu {
    
    JMenu menu;
    protected MainFrameMenuBar(){
        //menu erstellen
        menu = new JMenu("Main Menu");
        
        //MenuItem
        JMenuItem menuItem = new JMenuItem("someText");
        
        //menu add
        menu.add(menuItem);
    }
    
    public JMenu makeJMenu(){
    
        return menu;
    }
}

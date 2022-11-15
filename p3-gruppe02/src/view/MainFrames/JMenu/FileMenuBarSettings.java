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
public class FileMenuBarSettings extends JMenu {
    
    
    JMenu settings;
    protected FileMenuBarSettings(){
        //menu erstellen
        settings = new JMenu("Settings");
        
        //MenuItem
        JMenuItem menuItem = new JMenuItem("other text");
        
        //menu add
        settings.add(menuItem);
    }
    
    public JMenu makeJSettings(){
    
        return settings;
    }
}

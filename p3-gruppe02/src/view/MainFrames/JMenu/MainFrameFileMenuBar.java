/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author janri
 */
public class MainFrameFileMenuBar extends JMenuBar {

    public MainFrameFileMenuBar() {
        
        makeMenuBar();
    }

    public JMenuBar makeMenuBar() {
        
        //menu Bar
        JMenuBar bar = new JMenuBar();
        
        //Menu
        FileMenuBarMenu mainMenu = new FileMenuBarMenu();
        JMenu menuMain = mainMenu.makeJMenu();
        
        
        //settings
        FileMenuBarSettings set = new FileMenuBarSettings();
        JMenu settings = set.makeJSettings();
        
       
        
        //hinzufügen bar
        bar.add(menuMain);
        bar.add(settings);
        
        
        return bar;
    }

}

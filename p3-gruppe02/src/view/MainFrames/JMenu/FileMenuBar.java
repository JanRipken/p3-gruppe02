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
public class FileMenuBar extends JMenuBar {

    public FileMenuBar() {
        
        makeMenuBar();
    }

    public JMenuBar makeMenuBar() {
        
        //menu Bar
        JMenuBar bar = new JMenuBar();
        
        //Menu
        MainFrameMenuBar mainMenu = new MainFrameMenuBar();
        JMenu menuMain = mainMenu.makeJMenu();
        
        
        //settings
        MainFrameSettingsBar set = new MainFrameSettingsBar();
        JMenu settings = set.makeJSettings();
        
       
        
        //hinzufügen bar
        bar.add(menuMain);
        bar.add(settings);
        
        
        return bar;
    }

}

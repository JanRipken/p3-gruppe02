/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
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

        // close 
        MenuBarCloseMainFrame close = new MenuBarCloseMainFrame();
        JButton close1 = close.makeClose();

        // minimize
        MenuBarMinimizeMainFrame mini = new MenuBarMinimizeMainFrame();
        JButton minimize = mini.makeMinimize();
        

        //Linke Seite
        bar.add(menuMain);
        bar.add(settings);

        //Rechte Seite
        bar.add(Box.createHorizontalGlue());
        bar.add(minimize);
        bar.add(close1);

        return bar;
    }

}

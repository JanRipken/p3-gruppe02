/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view.menubar;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author janri
 */
public class MenuBar extends JMenuBar {

    public MenuBar() {

        makeMenuBar();
    }

    public JMenuBar makeMenuBar() {

        //menu Bar
        JMenuBar bar = new JMenuBar();

        //Menu
        Menu mainMenu = new Menu();
        JMenu menuMain = mainMenu.makeJMenu();

        //settings
        Settings set = new Settings();
        JMenu settings = set.makeJSettings();

        // close 
        Close close = new Close();
        JButton close1 = close.makeClose();

        // minimize
        Minimized mini = new Minimized();
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

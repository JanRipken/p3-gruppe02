package main.tomedb.java.mainframe.view.menubar;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {

    private JMenuBar bar;
    private Menu mainMenu;
    private hideColumns hideCol;
    private Settings settings;
    

    public MenuBar() {

        makeMenuBar();
    }

    public JMenuBar makeMenuBar() {

        // menu Bar
        bar = new JMenuBar();

        // Menu
        mainMenu = new Menu() ;

        JMenu menuMain = mainMenu.makeJMenu();

        try {
            hideCol = new hideColumns();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JMenu hideColums = hideCol.makeJSettings();

        // close
        Close close = new Close();
        JButton close1 = close.makeClose();
        
        //settings
        Settings set = new Settings();
        JButton set1 = set.makeSettings();

        // minimize
        Minimized mini = new Minimized();
        JButton minimize = mini.makeMinimize();

        // Left side
        bar.add(menuMain);
        bar.add(hideColums);

        // Right side
        bar.add(Box.createHorizontalGlue());

        bar.add(set1);
        //TODO: Freischalten sobald funktion gegeben ist
        //bar.add(minimize);
        bar.add(close1);

        return bar;
    }

}

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
    private Settings set;

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
            set = new Settings();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JMenu settings = set.makeJSettings();

        // close
        Close close = new Close();
        JButton close1 = close.makeClose();

        // minimize
        Minimized mini = new Minimized();
        JButton minimize = mini.makeMinimize();

        // Left side
        bar.add(menuMain);
        bar.add(settings);

        // Right side
        bar.add(Box.createHorizontalGlue());

        //TODO: Freischalten sobald funktion gegeben ist
        //bar.add(minimize);
        bar.add(close1);

        return bar;
    }

}

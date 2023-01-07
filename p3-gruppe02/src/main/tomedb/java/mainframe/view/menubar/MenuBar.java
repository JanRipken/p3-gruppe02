package main.tomedb.java.mainframe.view.menubar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {

    private JMenuBar bar;
    private Menu mainMenu;
    private HideColumns hideCol;
    private Settings settings;

    public MenuBar() {

        makeMenuBar();
    }

    public JMenuBar makeMenuBar() {

        bar = new JMenuBar();

        mainMenu = new Menu();

        JMenu menuMain = mainMenu.makeJMenu();

        try {
            hideCol = new HideColumns();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JMenu hideColums = hideCol.makeJSettings();

        Close close = new Close();
        JButton close1 = close.makeClose();

        Settings set = new Settings();
        JButton set1 = set.makeSettings();

        Minimized mini = new Minimized();
        JButton minimize = mini.makeMinimize();

        bar.add(menuMain);
        bar.add(hideColums);

        bar.add(Box.createHorizontalGlue());

        bar.add(set1);
        //TODO: Freischalten sobald funktion gegeben ist
        //bar.add(minimize);
        bar.add(close1);

        return bar;
    }

}

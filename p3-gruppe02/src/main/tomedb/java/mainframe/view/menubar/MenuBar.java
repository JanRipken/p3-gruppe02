package main.tomedb.java.mainframe.view.menubar;

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
        mainMenu = new Menu();
        JMenu menuMain = mainMenu.makeJMenu();

        // settings
        set = new Settings();
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
        bar.add(minimize);
        bar.add(close1);

        return bar;
    }

}

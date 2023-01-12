package main.tomedb.java.mainframe.view.menubar;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import main.tomedb.java.mainframe.view.MainFrame;

public class MenuBar extends JMenuBar {
    
    private JMenuBar bar;
    private Menu mainMenu;
    private HideColumns hideCol;
    private SettingsButton settings;
    
    public MenuBar() {
        
        returnMenuBar();
    }
    
    public JMenuBar returnMenuBar() {
        bar = new JMenuBar();
        
        mainMenu = new Menu();
        
        JLabel titel = new JLabel(MainFrame.title);
        
        JMenu menuMain = mainMenu.makeJMenu();
        
        try {
            hideCol = new HideColumns();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JMenu hideColums = hideCol.returnHideColumnsJMenu();
        
        Close close = new Close();
        JButton close1 = close.makeClose();
        
        SettingsButton set = new SettingsButton();
        JButton settingsButton = set.returnSettingsButton();
        
        Minimized mini = new Minimized();
        JButton minimize = mini.makeMinimize();
        
        bar.add(menuMain);
        bar.add(hideColums);

        // SRY :(
        bar.add(Box.createHorizontalGlue());
        bar.add(Box.createHorizontalGlue());

        bar.add(titel);
        
        bar.add(Box.createHorizontalGlue());
        bar.add(Box.createHorizontalGlue());
        bar.add(Box.createHorizontalGlue());

        bar.add(settingsButton);
        bar.add(minimize);
        bar.add(close1);
        return bar;
    }
}

package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.view.menubar.MenuBar;
import main.tomedb.java.mainframe.controller.MainFramDragMove;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import main.tomedb.java.mainframe.controller.WindowEventHandler;

import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;

public class MainFrame extends JFrame {

    public static ModifyIcons modIcons;
    private String title = "p3-gruppe02";
  
    public static MainPanel mainPanel;

    public MainFrame() {
        // removing the top bar
        this.setUndecorated(true);
 
        // implementing a Move / Drag handler
        MainFramDragMove drag = new MainFramDragMove(this);
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);

        addWindowListener(new WindowEventHandler());
        modIcons = new ModifyIcons();
        MenuBar menuBar = new MenuBar();

        this.setJMenuBar(menuBar.makeMenuBar());
 
        mainPanel = new MainPanel();
        


        this.setContentPane(mainPanel);
        
        
        

        this.setTitle(title);
        this.setSize(900, 600);

        this.setResizable(false);
        this.setVisible(true);

 
        ImageIcon icon = modIcons.scaling("/main/tomedb/ressources/icons/bucher.png", 30, 30);
        this.setIconImage(icon.getImage());

        // setting a border Radius
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        // start our window in the Center Location
        this.setLocationRelativeTo(null);
    }

}

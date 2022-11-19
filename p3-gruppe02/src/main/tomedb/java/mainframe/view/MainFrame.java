/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.view.menubar.MenuBar;
import main.tomedb.java.mainframe.controller.MainFramDragMove;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import main.tomedb.java.mainframe.controller.WindowEventHandler;

import java.awt.Image;
import java.awt.geom.RoundRectangle2D;


public class MainFrame extends JFrame {
    
    public MainFrame() {
        this.setUndecorated(true);
        
        
 
        MainFramDragMove drag = new MainFramDragMove(this);
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);
        
        
        addWindowListener(new WindowEventHandler());

        //setJMenuBar(new FileMenuBar());
        // erstellen der Klasse FileMenuBar und aufrufen der Methode zum einfügen der Menu bar
        MenuBar menuBar = new MenuBar();
        
        this.setJMenuBar(menuBar.makeMenuBar());
        
        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(), BorderLayout.CENTER);
        
        this.setTitle("p3-gruppe02");
        this.setSize(900, 600);
        
        this.setResizable(true);
        this.setVisible(true);
        
        // hinzufügen eines icons zur main app
        //https://www.flaticon.com/
        Image icon = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/main/tomedb/ressources/icons/bucher.png"));        
        this.setIconImage(icon);
        
        
        this.setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),15,15));
        
        // Startup des Fensters in der Mitte des Desktops
        this.setLocationRelativeTo(null);
    }
    
}

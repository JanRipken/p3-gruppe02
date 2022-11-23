
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

    private String title = "p3-gruppe02";

    public MainFrame() {
        // removing the top bar
        this.setUndecorated(true);

        // implementing a Move / Drag handler
        MainFramDragMove drag = new MainFramDragMove(this);
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);

        addWindowListener(new WindowEventHandler());

        MenuBar menuBar = new MenuBar();

        this.setJMenuBar(menuBar.makeMenuBar());

        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(), BorderLayout.CENTER);

        this.setTitle(title);
        this.setSize(900, 600);

        this.setResizable(false);
        this.setVisible(true);

        Image icon = Toolkit.getDefaultToolkit()
                .getImage(this.getClass().getResource("/main/tomedb/ressources/icons/bucher.png"));
        this.setIconImage(icon);

        // setting a border Radius
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        // start our window in the Center Location
        this.setLocationRelativeTo(null);
    }

}
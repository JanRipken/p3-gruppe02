package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.view.menubar.MenuBar;
import main.tomedb.java.mainframe.controller.MainFrameDragMove;
import javax.swing.JFrame;
import main.tomedb.java.mainframe.controller.WindowEventHandler;

import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;

public class MainFrame extends JFrame {

    public static ModifyIcons modIcons;
    private String title = "p3-gruppe02";

    public static MainPanel mainPanel;

    public MainFrame() {

        this.setUndecorated(true);

        MainFrameDragMove drag = new MainFrameDragMove(this);
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

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);
    }

}

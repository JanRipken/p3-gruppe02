package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.view.menubar.MenuBar;
import main.tomedb.java.mainframe.controller.MouseDragMove;
import javax.swing.JFrame;
import main.tomedb.java.mainframe.controller.WindowEventHandler;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;

public class MainFrame extends JFrame {

    public static ModifyIcons modIcons;
    public static String title = "TomeDB - Verwalten Sie ihre Bücher";
    public static MainPanel mainPanel;
   
    private final int windowWidth = 900;
    private final int windowHeight = 600;

    public MainFrame() {

        this.setUndecorated(true);

        MouseDragMove mouseDragMove = new MouseDragMove(this);
        this.addMouseListener(mouseDragMove);
        this.addMouseMotionListener(mouseDragMove);

        addWindowListener(new WindowEventHandler());
        modIcons = new ModifyIcons();
        MenuBar menuBar = new MenuBar();

        this.setJMenuBar(menuBar.returnMenuBar());

        mainPanel = new MainPanel();

        this.setContentPane(mainPanel);
        this.setSize(windowWidth, windowHeight);
        this.setVisible(true);

        ImageIcon icon = modIcons.scaling("/main/tomedb/ressources/icons/bucher.png", 30, 30);
        this.setIconImage(icon.getImage());

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);
    }
}
package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.view.menubar.BuildMenuBar;
import main.tomedb.java.controller.mouseadapter.DragMove;
import javax.swing.JFrame;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import main.tomedb.java.mainframe.controller.icons.ModifyIcons;

public class MainFrame extends JFrame {

    public static ModifyIcons modIcons;
    public static String title = "TomeDB - Verwalten Sie ihre Bücher";
    public static MainPanel mainPanel;
   
    private final int windowWidth = 900;
    private final int windowHeight = 600;

    /**
     * Konstruktor zum erstellen und designen des Hauptfensters
     * Initalisieren des Inhalts fürs Hauptfenster
     */
    public MainFrame() {

        this.setUndecorated(true);

        DragMove mouseDragMove = new DragMove(this,null);
        this.addMouseListener(mouseDragMove);
        this.addMouseMotionListener(mouseDragMove);


        modIcons = new ModifyIcons();
        BuildMenuBar buildMenuBar = new BuildMenuBar();

        this.setJMenuBar(buildMenuBar.returnMenuBar());

        mainPanel = new MainPanel();

        this.setContentPane(mainPanel);
        this.setSize(windowWidth, windowHeight);
        this.setVisible(true);

        ImageIcon imageIcon = modIcons.scaling("/main/tomedb/ressources/icons/bucher.png", 30, 30);
        this.setIconImage(imageIcon.getImage());

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);
    }
}
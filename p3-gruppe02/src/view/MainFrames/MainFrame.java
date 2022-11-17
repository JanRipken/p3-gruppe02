/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import view.MainFrames.JMenu.MainFrameFileMenuBar;
import controller.WindowController.WindowEventHandler;


public class MainFrame extends JFrame {

    

    public MainFrame() {

        
        addWindowListener(new WindowEventHandler());
  
        //setJMenuBar(new FileMenuBar());
        
        // erstellen der Klasse FileMenuBar und aufrufen der Methode zum einfügen der Menu bar
        MainFrameFileMenuBar menuBar = new MainFrameFileMenuBar();
        this.setJMenuBar(menuBar.makeMenuBar());
        
        
        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(),BorderLayout.CENTER);

        this.setTitle("p3-gruppe02");
        this.setSize(900, 600);

        this.setResizable(true);
        this.setVisible(true);

        // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

}

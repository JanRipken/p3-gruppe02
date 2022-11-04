/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MainFrameNorthController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author matthiaskoziol
 */
public class MainFrame extends JFrame {
    
    

    public class NorthPanel extends JPanel  {
            JButton newBookButton = new JButton("Neu");
            JLabel label = new JLabel();

            ImageIcon IconBook = new ImageIcon("buch.jpg");         
            Image BookImage = IconBook.getImage();
            Image modifiedBookImage = BookImage.getScaledInstance(100, 60, Image.SCALE_SMOOTH);     
            ImageIcon newBookIcon = new ImageIcon(modifiedBookImage);
            
            
        
        private NorthPanel() {
            
            newBookButton.addActionListener(new MainFrameNorthController(this));
            
            label.setIcon(newBookIcon);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            
            this.add(newBookButton);
            this.add(label);
            
            this.setLayout(new GridLayout());
     
        }
    }
    
    private class SouthPanel extends JPanel {

        public SouthPanel() {

            this.setLayout(new GridLayout());
            this.add(new JScrollPane());
            
            
        }

    }    
    public MainFrame(){
        
        addWindowListener(new WindowEventHandler());
        LayoutManager lm = new BorderLayout();
        this.setLayout(lm);

        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(), BorderLayout.CENTER);

        this.setTitle("p3-gruppe02");
        this.setSize(900, 600);
        
        this.setResizable(true);
        this.setVisible(true);
        
        
        // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }
    
    

}

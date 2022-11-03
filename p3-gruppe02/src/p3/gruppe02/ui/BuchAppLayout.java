/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.gruppe02.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author matthiaskoziol
 */
public class BuchAppLayout extends JFrame {
    
 

    private class NorthPanel extends JPanel implements ActionListener {

            JButton newBookButton = new JButton("Neu");
            JLabel label = new JLabel();

            ImageIcon IconBook = new ImageIcon("buch.jpg");         
            Image BookImage = IconBook.getImage();
            Image modifiedBookImage = BookImage.getScaledInstance(100, 60, Image.SCALE_SMOOTH);     
            ImageIcon newBookIcon = new ImageIcon(modifiedBookImage);
        
        public NorthPanel() {
      
            newBookButton.addActionListener(this);
            
            label.setIcon(newBookIcon);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            
            this.add(newBookButton);
            this.add(label);
            
            this.setLayout(new GridLayout());
     
        }

        @Override
        public void actionPerformed(ActionEvent e) { 
            if(e.getSource()==newBookButton){
                AddNewBook newBook = new AddNewBook();
                
            }
        }

    }
    
    private class SouthPanel extends JPanel {

        public SouthPanel() {

            this.setLayout(new GridLayout());
            this.add(new JScrollPane());
            
            
        }

    }    
    public BuchAppLayout(){
        
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

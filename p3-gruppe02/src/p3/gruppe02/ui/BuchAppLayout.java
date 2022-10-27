/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.gruppe02.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

/**
 *
 * @author matthiaskoziol
 */
public class BuchAppLayout extends JFrame {

    private class NorthPanel extends JPanel {

        public NorthPanel() {
            
            this.setLayout(new GridLayout());
            this.add(new JButton("Neu"));
            this.add(new JButton("ich werde ein bild"));
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
        this.setSize(400, 300);

        this.setResizable(true);
        this.setVisible(true);
    }

}

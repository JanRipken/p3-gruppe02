
package p3.gruppe02.ui;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddNewBook extends JFrame {
       
    JFrame addNewBookFrame = new JFrame();
    JPanel addNewBookPanel = new JPanel();
    
        
    AddNewBook(){


        
        
        addNewBookFrame.setSize(600, 900);
        addNewBookFrame.setVisible(true);
          
        addNewBookPanel.setLayout(new GridLayout(8,0));
      
        addNewBookFrame.add(addNewBookPanel);

        
        // Wieso startet das fenster nicht in der Mitte ?
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);

       
    }
    
    
}

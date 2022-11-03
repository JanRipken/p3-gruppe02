
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
       
    

    
     private class addNewBookPanel extends JPanel {

        public addNewBookPanel() {

            this.setLayout(new GridLayout(8,0));
            
            
            
        }

    } 
     
     
    AddNewBook(){
  
        this.add(new addNewBookPanel());
        
        this.setSize(600, 900);
        this.setResizable(true);
        this.setVisible(true);
              
        // // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);

       
    }
    
    
}

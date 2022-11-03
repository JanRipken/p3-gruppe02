
package p3.gruppe02.ui;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddNewBook extends JFrame {
       
    

    
     private class addNewBookPanel extends JPanel {

        JLabel labelTitelDesBuches = new JLabel("Geben sie hier bitte den Namen ihres Buches ein");
        JLabel labelAutorDesBuches = new JLabel("Geben sie hier bitte den Autor ihres Buches ein");
        JLabel labelAutorVornameDesBuches = new JLabel("Geben sie hier bitte den Vornamen des Autors ihres Buches ein");
        JLabel labelErscheinungsjahrDesBuches = new JLabel("Geben sie hier bitte das Erscheinungsjahr ihres Buches ein");
        JLabel labelSeitenanzahlDesBuches = new JLabel("geben sie hier die Seitenanzahl Ihres Buches an");
        JLabel labelWertungDesBuches = new JLabel("Wie bewerten sie dieses Buch ?");
        JLabel labelZweitesMalLesen = new JLabel("Wollen sie dieses Buch ein Zweites mal Lesen");
        
        public addNewBookPanel() {

            this.setLayout(new GridLayout(8,0));
            this.add(labelTitelDesBuches);
            this.add(labelAutorDesBuches);
            this.add(labelAutorVornameDesBuches);
            this.add(labelErscheinungsjahrDesBuches);
            this.add(labelSeitenanzahlDesBuches);
            this.add(labelWertungDesBuches);
            this.add(labelZweitesMalLesen);
            
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

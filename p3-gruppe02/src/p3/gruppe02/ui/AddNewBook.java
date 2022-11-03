
package p3.gruppe02.ui;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddNewBook extends JFrame {
       
    // Mehtode zum erstellen der Blöcke von Label und Textfeld
    protected class LayoutAddBook extends JPanel{
    
        JLabel label = new JLabel();
        JTextField textfield = new JTextField();
        
        public LayoutAddBook(String myLabel){
            this.setLayout(new GridLayout(0,1));
              label.setText(myLabel);
              
               this.add(label);
               this.add(textfield);
        }
    }
    
    
    //methode zum erstellen des Pannels fpr Abbrechen und Bestätigen Buttons
    protected class BestätigenOderAbbrechenPanel extends JPanel implements ActionListener {
    
        JButton ButtonBestätigen = new JButton("Bestätigen");
        JButton ButtonAbrechen = new JButton("Abrechen");
        
        public BestätigenOderAbbrechenPanel(){
            this.setLayout(new GridLayout(1,0));
            this.add(ButtonBestätigen);
            this.add(ButtonAbrechen);
            
            ButtonBestätigen.addActionListener(this);
            ButtonAbrechen.addActionListener(this);
         
        }    

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==ButtonBestätigen){
                // Einschreiben des Buches in die Db
                
                
                dispose();          
            }
            
            if(e.getSource()==ButtonAbrechen){
                dispose();              
            }
        }
        
    }
 
     private class addNewBookPanel extends JPanel {
   
        public addNewBookPanel() {

            this.setLayout(new GridLayout(8,0));
            
            this.add(new LayoutAddBook("Geben sie hier bitte den Namen ihres Buches ein"));
            this.add(new LayoutAddBook("Geben sie hier bitte den Autor ihres Buches ein"));
            this.add(new LayoutAddBook("Geben sie hier bitte den Vornamen des Autors ihres Buches ein"));
            this.add(new LayoutAddBook("Geben sie hier bitte das Erscheinungsjahr ihres Buches ein"));
            this.add(new LayoutAddBook("geben sie hier die Seitenanzahl Ihres Buches an"));
            this.add(new LayoutAddBook("Wie bewerten sie dieses Buch ?"));
            this.add(new LayoutAddBook("Wollen sie dieses Buch ein Zweites mal Lesen"));
                   
            this.add(new BestätigenOderAbbrechenPanel());
            
        }
    } 
    
    AddNewBook(){
        
        this.add(new addNewBookPanel());
        
        this.pack();
        this.setResizable(true);
  
        this.setVisible(true);
              
        // // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
      
    }    
}

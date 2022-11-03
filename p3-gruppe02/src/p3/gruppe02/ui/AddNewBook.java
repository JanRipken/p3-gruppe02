
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
    // Final damit die variable nur einmal genutzt werden kann
    // Eventulle überarbeiten bei erstellung der Änderungsseite
    private final String FrageBuchName = "Geben sie hier bitte den Namen ihres Buches ein";
    private final String FrageBuchAutor = "Geben sie hier bitte den Autor ihres Buches ein";
    private final String FrageBuchAutorVorname = "Geben sie hier bitte den Vornamen des Autors ihres Buches ein";
    private final String FrageBuchErscheinungsjahr = "Geben sie hier bitte das Erscheinungsjahr ihres Buches ein";
    private final String FrageBuchSeitenanzahl = "geben sie hier die Seitenanzahl Ihres Buches an";
    private final String FrageBuchBewertung = "Wie bewerten sie dieses Buch ?";
    private final String FrageBuchNochmalLesen = "Wollen sie dieses Buch ein Zweites mal Lesen";
       
    // Methode zum erstellen der Blöcke von Label und Textfeld
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
    protected class LayoutAddBook extends JPanel{
    
        JLabel label = new JLabel();
        JTextField textfield = new JTextField();
        
        public LayoutAddBook(String myLabel){
            this.setLayout(new GridLayout(0,1));
              label.setText(myLabel);
              
               this.add(label);
               this.add(textfield);
               
               switch(myLabel){
                   case FrageBuchName:
                       break;
                    case FrageBuchAutor:
                       break;
                    case FrageBuchAutorVorname:
                       break;
                    case FrageBuchErscheinungsjahr:
                       break;
                    case FrageBuchSeitenanzahl:
                       break;
                    case FrageBuchBewertung:
                       break;
                    case FrageBuchNochmalLesen:
                       break;   
               }
        }
    }
    
    // Methode zum erstellen der Blöcke von Label und Checkbox
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
    protected class LayoutAddBookCheckbox extends JPanel{
    
        JLabel label = new JLabel();
        JCheckBox CB = new JCheckBox();
        
        public LayoutAddBookCheckbox(String myLabel){
            this.setLayout(new GridLayout(0,1));
              label.setText(myLabel);
              
               this.add(label);
               this.add(CB);
        }
    }
    
    
    //Methode zum erstellen des Pannels fpr Abbrechen und Bestätigen Buttons
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
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
            
            this.add(new LayoutAddBook(FrageBuchName));
            this.add(new LayoutAddBook(FrageBuchAutor));
            this.add(new LayoutAddBook(FrageBuchAutorVorname));
            this.add(new LayoutAddBook(FrageBuchErscheinungsjahr));
            this.add(new LayoutAddBook(FrageBuchSeitenanzahl));
            this.add(new LayoutAddBook(FrageBuchBewertung));
            this.add(new LayoutAddBookCheckbox(FrageBuchNochmalLesen));
                   
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

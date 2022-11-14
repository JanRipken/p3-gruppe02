
package view;

import controller.AddNewBookButtonController;
import controller.TextfieldInputController;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
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
    
   private String TextfieldBuchName = "BookName"; 
   private String TextfieldAutorName = "AutorName"; 
   private String TextfieldAutorVorname = "AutorVorname"; 
   private String TextfieldErscheiunfsjahr = "Erscheinungsjahr"; 
   private String TextfieldSeitenanzahl = "Seitenanzahl"; 
   private String TextfieldBuchBewertung = "Bewertung"; 

    
    
   
    // Methode zum erstellen der Blöcke von Label und Textfeld
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
    public class LayoutAddBook extends JPanel{
    
        JLabel label = new JLabel();
        JTextField textfield = new JTextField();
        
        private LayoutAddBook(String myLabel,String myTextField){
            this.setLayout(new GridLayout(0,1));
            
              label.setText(myLabel);
              textfield.setName(myTextField);
              
               this.add(label);
               this.add(textfield);
               String textFieldText = textfield.getText();
             
               
                TextfieldInputController text = new TextfieldInputController(this,textfield);
                textfield.addActionListener(text);
               
        } 
    }
    
    // Methode zum erstellen der Blöcke von Label und Checkbox
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
    protected class LayoutAddBookCheckbox extends JPanel{
    
        JLabel label = new JLabel();
        JCheckBox CB = new JCheckBox();
        
        public  LayoutAddBookCheckbox(String myLabel){
            this.setLayout(new GridLayout(0,1));
              label.setText(myLabel);
               
               this.add(label);
               this.add(CB);
               
        }
    }
    
    
    //Methode zum erstellen des Pannels fpr Abbrechen und Bestätigen Buttons
    // Protected damit nur die Klassen in diesem Paket darauf zugreifen können
    public class BestätigenOderAbbrechenPanel extends JPanel  {
    
        JButton ButtonBestätigen = new JButton("Bestätigen");
        JButton ButtonAbrechen = new JButton("Abrechen");
        
        private BestätigenOderAbbrechenPanel(){
            
            ButtonAbrechen.setName("ButtonAbrechenAbbrechen");
            this.setLayout(new GridLayout(1,0));
            this.add(ButtonBestätigen);
            this.add(ButtonAbrechen);
            
            
            String ButtonAbrechenAbbrechen = ButtonAbrechen.getName();
            
            AddNewBookButtonController close = new AddNewBookButtonController(this,ButtonAbrechenAbbrechen );
            ButtonAbrechen.addActionListener(close);
            
        }    

       
        
        
    }
 
     private class addNewBookPanel extends JPanel {
   
        public addNewBookPanel() {

            this.setLayout(new GridLayout(8,0));
            
            this.add(new LayoutAddBook(FrageBuchName,TextfieldBuchName));
            this.add(new LayoutAddBook(FrageBuchAutor,TextfieldAutorName));
            this.add(new LayoutAddBook(FrageBuchAutorVorname,TextfieldAutorVorname));
            this.add(new LayoutAddBook(FrageBuchErscheinungsjahr,TextfieldErscheiunfsjahr));
            this.add(new LayoutAddBook(FrageBuchSeitenanzahl,TextfieldSeitenanzahl));
            this.add(new LayoutAddBook(FrageBuchBewertung,TextfieldBuchBewertung));
            this.add(new LayoutAddBookCheckbox(FrageBuchNochmalLesen));
                   
            this.add(new BestätigenOderAbbrechenPanel());
               
            
        }
    } 
    
    public AddNewBook(){
        
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

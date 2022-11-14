
package view.AddNewBookFrames;


import controller.AddNewBookButtonController;
import controller.AddNewBookController;
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

    //Initialisierung der Layouts
     LayoutAddBook titel;
     LayoutAddBook AutorName;
     LayoutAddBook AutorVorName;
     LayoutAddBook Erscheinungsjahr;
     LayoutAddBook Seitenanzahl;
     LayoutAddBook bewertung;
     LayoutAddBookCheckbox nochmallesen;
    
     
    public AddNewBook(){
        
        // Hauptpanel erstellen
        AddNewBookPanel panel = new AddNewBookPanel();
       
        
        // erstellen der einzlenen layouts für das Panel
        titel = new LayoutAddBook(FrageBuchName,TextfieldBuchName);
        AutorName = new LayoutAddBook(FrageBuchAutor,TextfieldAutorName);
        AutorVorName = new LayoutAddBook(FrageBuchAutorVorname,TextfieldAutorVorname);
        Erscheinungsjahr = new LayoutAddBook(FrageBuchErscheinungsjahr,TextfieldErscheiunfsjahr);
        Seitenanzahl = new LayoutAddBook(FrageBuchSeitenanzahl,TextfieldSeitenanzahl);
        bewertung = new LayoutAddBook(FrageBuchBewertung,TextfieldBuchBewertung);
        nochmallesen = new LayoutAddBookCheckbox(FrageBuchNochmalLesen);
        AbbrechenOderBestätigenPanel AbbbbruchOderSpeichern = new AbbrechenOderBestätigenPanel();
        
                
        //Controller
        AddNewBookController modelBook = new AddNewBookController(this);
        AbbbbruchOderSpeichern.ButtonBestätigen.addActionListener(modelBook);
        
        //Testweise bereits namen setzen
        titel.textfield.setText("Java weil es so schoen ist");
        AutorName.textfield.setText("Musterman");
        AutorVorName.textfield.setText("Max");
        Erscheinungsjahr.textfield.setText("2021");
        Seitenanzahl.textfield.setText("356");
        bewertung.textfield.setText("5.6");
        
        // Zum Hauptpanel hinzufügen
        panel.add(titel);
        panel.add(AutorName);
        panel.add(AutorVorName);
        panel.add(Erscheinungsjahr);
        panel.add(Seitenanzahl);
        panel.add(bewertung);
        panel.add(nochmallesen);
        panel.add(AbbbbruchOderSpeichern);
 
        // Panel zum hauptframe hinzufügen
        this.add(panel);
        

        
        // anderes
        this.pack();
        this.setResizable(true);
  
        this.setVisible(true);
          
        // // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
      
    }
    
    
    public String getTitel(){         
        return titel.textfield.getText();
    }
    
    public String getAutorName(){         
        return AutorName.textfield.getText();
    }
    
    public String getAutorVorname(){         
        return AutorVorName.textfield.getText();
    }
    
    public int getErscheinungsjahr(){         
        return Integer.parseInt(Erscheinungsjahr.textfield.getText());
        
    }
    
    public int getSeitenzahl(){         
        return Integer.parseInt(Seitenanzahl.textfield.getText());
    }
    
    public Boolean getNochmallesen(){         
        if(nochmallesen.CB.isSelected()){
            return true;
        }
        return false;
    }
    
    
    
  
    
}

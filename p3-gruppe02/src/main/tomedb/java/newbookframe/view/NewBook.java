
package main.tomedb.java.newbookframe.view;


import main.tomedb.java.newbookframe.view.Buttons;
import main.tomedb.java.newbookframe.controller.Abort;
import main.tomedb.java.newbookframe.controller.Save;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Set;
import javax.swing.JFrame;
import main.tomedb.java.newbookframe.controller.Abort;
import main.tomedb.java.newbookframe.controller.Save;
import main.tomedb.java.newbookframe.view.MainPanel;
import main.tomedb.java.newbookframe.view.LayoutTextfield;
import main.tomedb.java.newbookframe.view.LayoutCheckBox;

public class NewBook extends JFrame {
    
    // Final damit die variable nur einmal genutzt werden kann
    // Eventulle überarbeiten bei erstellung der Änderungsseite
    private final String FrageBuchName = "Buchtitel";
    private final String FrageBuchAutor = "Name des Autors";
    private final String FrageBuchAutorVorname = "Vorname des Autors";
    private final String FrageBuchErscheinungsjahr = "Erscheinungsjahr";
    private final String FrageBuchSeitenanzahl = "Seitenanzahl";
    private final String FrageBuchBewertung = "Bewertung";
    private final String FrageBuchNochmalLesen = "Erneut Lesen ?";

    // Tooltips
    // TODO: überarbeiten
    private final String TooltipErscheinungsjahr = "Geben sie das Erscheinungjahr bitte eimal in INT an ";
    private final String TooltipSeitenanzahl = "Geben sie das Erscheinungjahr bitte eimal in INT an ";
    private final String TooltipBewertung = "Geben sie ihre Bewertung bitte eimal in DOUBLE an";


    //Initialisierung der Layouts
     LayoutTextfield titel;
     LayoutTextfield AutorName;
     LayoutTextfield AutorVorName;
     LayoutTextfield Erscheinungsjahr;
     LayoutTextfield Seitenanzahl;
     LayoutTextfield bewertung;
     LayoutCheckBox nochmallesen;
    
     
    public NewBook(){
        
        // hinzufügen eines icons zur addBook app
        //https://www.flaticon.com/
        Image icon = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/main/tomedb/ressources/icons/bookAdd.png"));        
        this.setIconImage(icon);
        
        
        // Hauptpanel erstellen
        MainPanel mainPanel = new MainPanel();
       
        // erstellen der einzlenen layouts für das Panel
        titel = new LayoutTextfield(FrageBuchName);
        AutorName = new LayoutTextfield(FrageBuchAutor);
        AutorVorName = new LayoutTextfield(FrageBuchAutorVorname);
        Erscheinungsjahr = new LayoutTextfield(FrageBuchErscheinungsjahr);
        Seitenanzahl = new LayoutTextfield(FrageBuchSeitenanzahl);
        bewertung = new LayoutTextfield(FrageBuchBewertung);
        nochmallesen = new LayoutCheckBox(FrageBuchNochmalLesen);
        Buttons AbbbbruchOderSpeichern = new Buttons();

        
        //Tooltips
        Erscheinungsjahr.textfield.setToolTipText(TooltipErscheinungsjahr);
        Seitenanzahl.textfield.setToolTipText(TooltipSeitenanzahl);
        bewertung.textfield.setToolTipText(TooltipBewertung);
                
        //Controller
        Save modelBook = new Save(this);
        AbbbbruchOderSpeichern.ButtonBestätigen.addActionListener(modelBook);
        
        Abort abbrechen = new Abort(this);
        AbbbbruchOderSpeichern.ButtonAbrechen.addActionListener(abbrechen);
        
        
        
        
        //Testweise bereits namen setzen
        titel.textfield.setText("Java 2019");
        AutorName.textfield.setText("Musterman");
        AutorVorName.textfield.setText("Max");
        Erscheinungsjahr.textfield.setText("2021");
        Seitenanzahl.textfield.setText("3019");
        bewertung.textfield.setText("7.2");
        
        // Zum Hauptpanel hinzufügen
        mainPanel.add(titel);
        mainPanel.add(AutorName);
        mainPanel.add(AutorVorName);
        mainPanel.add(Erscheinungsjahr);
        mainPanel.add(Seitenanzahl);
        mainPanel.add(bewertung);
        mainPanel.add(nochmallesen);
        mainPanel.add(AbbbbruchOderSpeichern);
        

 
        // Panel zum hauptframe hinzufügen
        this.setContentPane(mainPanel);
      
        

        
        // anderes
        this.setPreferredSize(new Dimension(350,600));
        this.pack();
        this.setResizable(true);
        
        
        this.setVisible(true);
          
        // // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
      
    }
    
    
    // TODO: Überarbeiten / Checken
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
    
    public double getbewertung(){
        return Double.parseDouble(bewertung.textfield.getText());
    }
    
    public Boolean getNochmallesen(){         
        if(nochmallesen.CB.isSelected()){
            return true;
        }
        return false;
    } 
    
}

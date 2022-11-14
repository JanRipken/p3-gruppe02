
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

    
     
    public AddNewBook(){
           
        AddNewBookPanel panel = new AddNewBookPanel();
        AbbrechenOderBestätigenPanel Abbbbruuuch = new AbbrechenOderBestätigenPanel();
        
        LayoutAddBook titel = new LayoutAddBook(FrageBuchName,TextfieldBuchName);
        LayoutAddBook AutorName = new LayoutAddBook(FrageBuchAutor,TextfieldAutorName);
        LayoutAddBook AutorVorName = new LayoutAddBook(FrageBuchAutorVorname,TextfieldAutorVorname);
        LayoutAddBook Erscheinungsjahr = new LayoutAddBook(FrageBuchErscheinungsjahr,TextfieldErscheiunfsjahr);
        LayoutAddBook Seitenanzahl = new LayoutAddBook(FrageBuchSeitenanzahl,TextfieldSeitenanzahl);
        LayoutAddBook bewertung = new LayoutAddBook(FrageBuchBewertung,TextfieldBuchBewertung);
        LayoutAddBookCheckbox nochmallesen = new LayoutAddBookCheckbox(FrageBuchNochmalLesen);
        
        panel.add(titel);
        panel.add(AutorName);
        panel.add(AutorVorName);
        panel.add(Erscheinungsjahr);
        panel.add(Seitenanzahl);
        panel.add(bewertung);
        panel.add(nochmallesen);
        panel.add(Abbbbruuuch);
 
        this.add(panel);
        
        this.pack();
        this.setResizable(true);
  
        this.setVisible(true);
          
        // // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
      
    }
    
  
    
}

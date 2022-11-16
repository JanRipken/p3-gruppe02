/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import controller.MenuBar.BuchTitelOnOff;
import controller.MenuBar.AutorOnOff;
import controller.MenuBar.ErscheinungsjahrOnOff;
import controller.MenuBar.BewertungOnOff;
import controller.MenuBar.NochmallesenOnOff;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

/**
 *
 * @author janri
 */
public class FileMenuBarSettings extends JMenu {
    
    
    JMenu settings;
    protected FileMenuBarSettings(){
        //menu erstellen
        settings = new JMenu("Settings");
        
        //MenuItem
        JCheckBoxMenuItem BuchTitel = new JCheckBoxMenuItem("Buch Titel");
        JCheckBoxMenuItem Autor = new JCheckBoxMenuItem("Autor");
        JCheckBoxMenuItem Erscheinungsjahr = new JCheckBoxMenuItem("Erscheinungsjahr");
        JCheckBoxMenuItem Bewertung = new JCheckBoxMenuItem("Bewertung");
        JCheckBoxMenuItem NochmalLesen = new JCheckBoxMenuItem("Nochmal lesen");
        
        //menu add
        settings.add(BuchTitel);
        settings.add(Autor);
        settings.add(Erscheinungsjahr);
        settings.add(Bewertung);
        settings.add(NochmalLesen);    
        
        //controller hinzufügen für BuchTitel
        BuchTitelOnOff togglebuchtitel = new BuchTitelOnOff(this);
        BuchTitel.addActionListener(togglebuchtitel);   
        
        //controller hinzufügen für Autor
        AutorOnOff toggleautor = new AutorOnOff(this);
        Autor.addActionListener(toggleautor);  
        
        //controller hinzufügen für Erscheinungsjahr
        ErscheinungsjahrOnOff toggleerscheinungsjahr = new ErscheinungsjahrOnOff(this);
        Erscheinungsjahr.addActionListener(toggleerscheinungsjahr); 
        
        //controller hinzufügen für Bewertung
        BewertungOnOff togglebewertung = new BewertungOnOff(this);
        Bewertung.addActionListener(togglebewertung); 
        
        //controller hinzufügen für Nochmal lesen
        NochmallesenOnOff togglenochmallesen = new NochmallesenOnOff(this);
        NochmalLesen.addActionListener(togglenochmallesen);    
    }
    
    public JMenu makeJSettings(){
    
        return settings;
    }
}

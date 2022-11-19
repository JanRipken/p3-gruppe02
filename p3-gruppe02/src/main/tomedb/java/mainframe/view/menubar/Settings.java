/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.settings.BuchTitelOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.AutorOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.ErscheinungsjahrOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.BewertungOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.NochmallesenOnOff;
import javax.swing.JCheckBox;
import javax.swing.JMenu;

/**
 *
 * @author janri
 */
public class Settings extends JMenu {
    
    
    JMenu settings;
    protected Settings(){
        //menu erstellen
        settings = new JMenu("Settings");
        
        //MenuItem
        JCheckBox BuchTitel = new JCheckBox("Buch Titel");
        JCheckBox Autor = new JCheckBox("Autor");
        JCheckBox Erscheinungsjahr = new JCheckBox("Erscheinungsjahr");
        JCheckBox Bewertung = new JCheckBox("Bewertung");
        JCheckBox NochmalLesen = new JCheckBox("Nochmal lesen");
        
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

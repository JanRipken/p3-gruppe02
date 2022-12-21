
package main.tomedb.java.mainframe.view.menubar;

import javax.swing.ButtonGroup;
import main.tomedb.java.mainframe.controller.menubar.settings.BuchTitelOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.AutorOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.ErscheinungsjahrOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.BewertungOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.NochmallesenOnOff;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import main.tomedb.java.mainframe.controller.menubar.settings.DarkMode;
import main.tomedb.java.mainframe.controller.menubar.settings.SystemMode;


public class Settings extends JMenu {

    private JMenu settings;
    private JCheckBox BuchTitel;
    private JCheckBox Autor;
    private JCheckBox Erscheinungsjahr;
    private JCheckBox Bewertung;
    private JCheckBox NochmalLesen;
    
    private JRadioButton Dark;
    private JRadioButton Light;
    private JRadioButton System;

    public Settings() throws ClassNotFoundException {

        settings = new JMenu("Settings");

        BuchTitel = new JCheckBox("Buch Titel");
        Autor = new JCheckBox("Autor");
        Erscheinungsjahr = new JCheckBox("Erscheinungsjahr");
        Bewertung = new JCheckBox("Bewertung");
        NochmalLesen = new JCheckBox("Nochmal lesen");

        Dark = new JRadioButton("Dark Mode");
        System = new JRadioButton("System Design");
        
        ButtonGroup btngrp =  new ButtonGroup();
        btngrp.add(Dark);
        btngrp.add(System);
        
        settings.add(BuchTitel);
        settings.add(Autor);
        settings.add(Erscheinungsjahr);
        settings.add(Bewertung);
        settings.add(NochmalLesen);
        settings.addSeparator();
        settings.add(Dark);

        settings.add(System);
        

        BuchTitelOnOff toggleBuchTitel = new BuchTitelOnOff();
        BuchTitel.addActionListener(toggleBuchTitel);

        AutorOnOff toggleAutor = new AutorOnOff();
        Autor.addActionListener(toggleAutor);

        ErscheinungsjahrOnOff toggleErscheinungsjahr = new ErscheinungsjahrOnOff();
        Erscheinungsjahr.addActionListener(toggleErscheinungsjahr);

        BewertungOnOff toggleBewertung = new BewertungOnOff();
        Bewertung.addActionListener(toggleBewertung);

        NochmallesenOnOff toggleNochmalLesen = new NochmallesenOnOff(NochmalLesen);
        NochmalLesen.addActionListener(toggleNochmalLesen);
        
        
        DarkMode dm = new DarkMode();
        Dark.addActionListener(dm);
        
        
        SystemMode sd = new SystemMode();
        System.addActionListener(sd);
        
    }

    public JMenu makeJSettings() {

        return settings;
    }
}

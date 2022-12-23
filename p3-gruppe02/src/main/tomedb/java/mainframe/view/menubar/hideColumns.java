
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

import main.tomedb.java.mainframe.controller.menubar.settings.SeitenanzahlOnOff;

import main.tomedb.java.mainframe.controller.menubar.settings.VornameOnOff;


public class hideColumns extends JMenu {

    private JMenu settings;
    private JCheckBox BuchTitel;
    private JCheckBox Autor;
    private JCheckBox Vorname;
    private JCheckBox Erscheinungsjahr;
    private JCheckBox Bewertung;
    private JCheckBox NochmalLesen;
    private JCheckBox Seitenanzahl;
    
    public hideColumns() throws ClassNotFoundException {

        settings = new JMenu("Ausblenden");

        BuchTitel = new JCheckBox("Buch Titel");
        Autor = new JCheckBox("Autor");
        Vorname = new JCheckBox("Vorname");
        Erscheinungsjahr = new JCheckBox("Erscheinungsjahr");
        Seitenanzahl = new JCheckBox("Seitenanzahl");
        Bewertung = new JCheckBox("Bewertung");
        NochmalLesen = new JCheckBox("Nochmal lesen");

        

        
        settings.add(BuchTitel);
        settings.add(Autor);
        settings.add(Vorname);
        settings.add(Erscheinungsjahr);
        settings.add(Seitenanzahl);
        settings.add(Bewertung);
        settings.add(NochmalLesen);
        

        BuchTitelOnOff toggleBuchTitel = new BuchTitelOnOff(BuchTitel);
        BuchTitel.addActionListener(toggleBuchTitel);

        AutorOnOff toggleAutor = new AutorOnOff(Autor);
        Autor.addActionListener(toggleAutor);
        
        VornameOnOff toggleVorname = new VornameOnOff(Vorname);
        Vorname.addActionListener(toggleVorname);

        ErscheinungsjahrOnOff toggleErscheinungsjahr = new ErscheinungsjahrOnOff(Erscheinungsjahr);
        Erscheinungsjahr.addActionListener(toggleErscheinungsjahr);
        
        SeitenanzahlOnOff toggleSeitenanzahl = new SeitenanzahlOnOff(Seitenanzahl);
        Seitenanzahl.addActionListener(toggleSeitenanzahl);

        BewertungOnOff toggleBewertung = new BewertungOnOff(Bewertung);
        Bewertung.addActionListener(toggleBewertung);

        NochmallesenOnOff toggleNochmalLesen = new NochmallesenOnOff(NochmalLesen);
        NochmalLesen.addActionListener(toggleNochmalLesen);
        
        
    }

    public JMenu makeJSettings() {

        return settings;
    }
}

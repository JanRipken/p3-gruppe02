
package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.settings.BuchTitelOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.AutorOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.ErscheinungsjahrOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.BewertungOnOff;
import main.tomedb.java.mainframe.controller.menubar.settings.NochmallesenOnOff;
import javax.swing.JCheckBox;
import javax.swing.JMenu;

public class Settings extends JMenu {

    private JMenu settings;
    private JCheckBox BuchTitel;
    private JCheckBox Autor;
    private JCheckBox Erscheinungsjahr;
    private JCheckBox Bewertung;
    private JCheckBox NochmalLesen;

    public Settings() {

        settings = new JMenu("Settings");

        BuchTitel = new JCheckBox("Buch Titel");
        Autor = new JCheckBox("Autor");
        Erscheinungsjahr = new JCheckBox("Erscheinungsjahr");
        Bewertung = new JCheckBox("Bewertung");
        NochmalLesen = new JCheckBox("Nochmal lesen");

        settings.add(BuchTitel);
        settings.add(Autor);
        settings.add(Erscheinungsjahr);
        settings.add(Bewertung);
        settings.add(NochmalLesen);

        BuchTitelOnOff toggleBuchTitel = new BuchTitelOnOff();
        BuchTitel.addActionListener(toggleBuchTitel);

        AutorOnOff toggleAutor = new AutorOnOff();
        Autor.addActionListener(toggleAutor);

        ErscheinungsjahrOnOff toggleErscheinungsjahr = new ErscheinungsjahrOnOff();
        Erscheinungsjahr.addActionListener(toggleErscheinungsjahr);

        BewertungOnOff toggleBewertung = new BewertungOnOff();
        Bewertung.addActionListener(toggleBewertung);

        NochmallesenOnOff toggleNochmalLesen = new NochmallesenOnOff();
        NochmalLesen.addActionListener(toggleNochmalLesen);
    }

    public JMenu makeJSettings() {

        return settings;
    }
}

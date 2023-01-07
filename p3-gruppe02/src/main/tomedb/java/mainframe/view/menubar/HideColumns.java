package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.hide.BookTitle;
import main.tomedb.java.mainframe.controller.menubar.hide.LastName;
import main.tomedb.java.mainframe.controller.menubar.hide.PublishingYear;
import main.tomedb.java.mainframe.controller.menubar.hide.Valuation;
import main.tomedb.java.mainframe.controller.menubar.hide.ReadAgain;
import javax.swing.JCheckBox;
import javax.swing.JMenu;

import main.tomedb.java.mainframe.controller.menubar.hide.PageCount;
import main.tomedb.java.mainframe.controller.menubar.hide.FirstName;

public class HideColumns extends JMenu {

    private JMenu settings;
    private JCheckBox BuchTitel;
    private JCheckBox Autor;
    private JCheckBox Vorname;
    private JCheckBox Erscheinungsjahr;
    private JCheckBox Bewertung;
    private JCheckBox NochmalLesen;
    private JCheckBox Seitenanzahl;

    public HideColumns() throws ClassNotFoundException {

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

        BookTitle toggleBuchTitel = new BookTitle(BuchTitel);
        BuchTitel.addActionListener(toggleBuchTitel);

        LastName toggleAutor = new LastName(Autor);
        Autor.addActionListener(toggleAutor);

        FirstName toggleVorname = new FirstName(Vorname);
        Vorname.addActionListener(toggleVorname);

        PublishingYear toggleErscheinungsjahr = new PublishingYear(Erscheinungsjahr);
        Erscheinungsjahr.addActionListener(toggleErscheinungsjahr);

        PageCount toggleSeitenanzahl = new PageCount(Seitenanzahl);
        Seitenanzahl.addActionListener(toggleSeitenanzahl);

        Valuation toggleBewertung = new Valuation(Bewertung);
        Bewertung.addActionListener(toggleBewertung);

        ReadAgain toggleNochmalLesen = new ReadAgain(NochmalLesen);
        NochmalLesen.addActionListener(toggleNochmalLesen);

    }

    public JMenu makeJSettings() {

        return settings;
    }
}

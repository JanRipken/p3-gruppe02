package main.tomedb.java.newbookframe.view;

import main.tomedb.java.newbookframe.controller.Abort;
import main.tomedb.java.newbookframe.controller.Save;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import main.tomedb.java.newbookframe.controller.DragMove;

public class NewBook extends JFrame {

    // Final damit die variable nur einmal genutzt werden kann
    // Eventulle überarbeiten bei erstellung der Änderungsseite
    public String FrageBuchName = "Buchtitel";
    public String FrageBuchAutor = "Name des Autors";
    public String FrageBuchAutorVorname = "Vorname des Autors";
    public String FrageBuchErscheinungsjahr = "Erscheinungsjahr";
    public String FrageBuchSeitenanzahl = "Seitenanzahl";
    public String FrageBuchBewertung = "Bewertung";
    public String FrageBuchNochmalLesen = "Erneut Lesen ?";

    // Tooltips
    // TODO: überarbeiten
    private final String TooltipErscheinungsjahr = "Geben sie das Erscheinungjahr bitte eimal in INT an ";
    private final String TooltipSeitenanzahl = "Geben sie das Erscheinungjahr bitte eimal in INT an ";
    private final String TooltipBewertung = "Geben sie ihre Bewertung bitte eimal in DOUBLE an";

    public static JTextField titel;
    public static JTextField AutorName;
    public static JTextField AutorVorName;
    public static JTextField Erscheinungsjahr;
    public static JTextField Seitenanzahl;
    public static JTextField bewertung;
    public static JCheckBox nochmallesen;

    public NewBook() {

        this.setUndecorated(true);

        DragMove drag = new DragMove(this);
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);

        Image icon = Toolkit.getDefaultToolkit()
                .getImage(this.getClass().getResource("/main/tomedb/ressources/icons/bookAdd.png"));
        this.setIconImage(icon);

        MainPanel mainPanel = new MainPanel();

        titel = mainPanel.LayoutTextfield(FrageBuchName);
        AutorName = mainPanel.LayoutTextfield(FrageBuchAutor);
        AutorVorName = mainPanel.LayoutTextfield(FrageBuchAutorVorname);
        Erscheinungsjahr = mainPanel.LayoutTextfieldInt(FrageBuchErscheinungsjahr);
        Seitenanzahl = mainPanel.LayoutTextfieldInt(FrageBuchSeitenanzahl);
        bewertung = mainPanel.LayoutTextfieldDouble(FrageBuchBewertung);
        nochmallesen = mainPanel.LayoutCheckBox(FrageBuchNochmalLesen);

        Erscheinungsjahr.setToolTipText(TooltipErscheinungsjahr);
        Seitenanzahl.setToolTipText(TooltipSeitenanzahl);
        bewertung.setToolTipText(TooltipBewertung);

        mainPanel.Buttons();

        Save modelBook = new Save(this);
        mainPanel.ButtonBestätigen.addActionListener(modelBook);

        Abort abbrechen = new Abort(this);
        mainPanel.ButtonAbrechen.addActionListener(abbrechen);

        // TODO Löschen
        // Testweise bereits namen setzen
        titel.setText("Java 2019");
        AutorName.setText("Musterman");
        AutorVorName.setText("Max");
        Erscheinungsjahr.setText("2021");
        Seitenanzahl.setText("3019");
        bewertung.setText("7.2");

        this.setContentPane(mainPanel);

        this.setPreferredSize(new Dimension(350, 600));
        this.pack();
        this.setResizable(false);

        this.setVisible(true);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);

    }

    // TODO: Überarbeiten / Checken
    // TODO: Textfield = Formatted textfield ?
    public String getTitel() {

        return titel.getText();

    }

    public String getAutorName() {
        return AutorName.getText();
    }

    public String getAutorVorname() {
        return AutorVorName.getText();
    }

    public int getErscheinungsjahr() {
        if (Erscheinungsjahr.getText().equals("")) {
            return 0;
           
        } else {
             return Integer.parseInt(Erscheinungsjahr.getText());
        }

    }

    public int getSeitenzahl() {
        if ( Seitenanzahl.getText().equals("")) {
            return 0;
            
        } else {
            return Integer.parseInt(Seitenanzahl.getText());
        }
    }

    public double getbewertung() {
        if (bewertung.getText().equals("")) {
            return 0;
        } else {
            return Double.parseDouble(bewertung.getText());
        }

    }

    public Boolean getNochmallesen() {

        return nochmallesen.isSelected();
    }

}

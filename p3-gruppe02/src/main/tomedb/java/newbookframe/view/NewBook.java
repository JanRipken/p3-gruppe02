package main.tomedb.java.newbookframe.view;

import main.tomedb.java.newbookframe.controller.Abort;
import main.tomedb.java.newbookframe.controller.Save;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.newbookframe.controller.DragMove;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.newbookframe.view.NewBookFrameMainPanel;
import main.tomedb.java.newbookframe.controller.NewOrEditContent;

public class NewBook extends JFrame {

    private BookModel model;
    public BookModelList list;
    public JTable table;

    private final String FrageBuchName = "Buchtitel";
    private final String FrageBuchAutor = "Name des Autors";
    private final String FrageBuchAutorVorname = "Vorname des Autors";
    private final String FrageBuchErscheinungsjahr = "Erscheinungsjahr";
    private final String FrageBuchSeitenanzahl = "Seitenanzahl";
    private final String FrageBuchBewertung = "Bewertung";
    private final String FrageBuchNochmalLesen = "Erneut Lesen ?";

    // TODO: überarbeiten
    private final String TooltipErscheinungsjahr = "Geben sie das Erscheinungjahr bitte eimal mit einer Zahl an ";
    private final String TooltipSeitenanzahl = "Geben sie das Erscheinungjahreimal mit einer Zahl an ";
    private final String TooltipBewertung = "Geben sie ihre Bewertung bitte eimal mit einer Zahl an";

    public static JTextField titel;
    public static JTextField AutorName;
    public static JTextField AutorVorName;
    public static JTextField Erscheinungsjahr;
    public static JTextField Seitenanzahl;
    public static JTextField bewertung;
    public static JCheckBox nochmallesen;

    public NewBook() {

        this.setUndecorated(true);

        ImageIcon icon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/bookAdd.png", 30, 30);
        this.setIconImage(icon.getImage());

        NewBookFrameMainPanel mainPanel = new NewBookFrameMainPanel();

        DragMove drag = new DragMove(this);
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);

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

        NewOrEditContent newOrEditContent = new NewOrEditContent();
        newOrEditContent.NewOrEditContent();

        this.setContentPane(mainPanel);

        this.setPreferredSize(new Dimension(350, 600));
        this.pack();
        this.setResizable(false);

        this.setVisible(true);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);

    }

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
        if (Seitenanzahl.getText().equals("")) {
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

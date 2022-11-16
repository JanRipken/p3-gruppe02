/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class SouthPanel extends JPanel {

    public static SouthPanelJList JlistTabelle;

    public SouthPanel() {

        JlistTabelle = new SouthPanelJList();
        this.add(JlistTabelle);
        
        
        //this.setLayout(new GridLayout());

        /*
            //test - 2 bücher erstellt um diese auslesen zu lassen
            BookModel buch1 = new BookModel("BuchEins");
            BookModel buch2 = new BookModel("BuchDos");
            
            //Erstellen der Tabelle
            //Spalteninhalt
            //test - Titel werden ausgelesen
            String[][] data = {
                {buch1.getTitel(),"Mustermann", "Max", "123", "true", "1.2", "1990"},
                {buch2.getTitel(), "Musterfrau", "Maxine", "456", "false", "6.7", "2021"}
            };
            // Spaltennamen
            String[] columnNames = {"Titel", "AutorName", "AutorVorname", "Seitenanzahl", "Gelesen", "Bewertung", "Erscheinungsjahr"};
            // Initiallisierung
            JTable tabelle = new JTable(data, columnNames);
            // in eine ScrollPane einsetzen, macht die tabelle scrollbar
            JScrollPane sp = new JScrollPane(tabelle);
            this.add(sp);

         */
    }

}

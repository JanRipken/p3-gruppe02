/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import java.io.IOException;
import javax.swing.SwingUtilities;
import model.BookModelList;
import view.MainFrames.MainFrame;
import java.util.Vector;
import model.BookModel;
import model.BookModelListDAO;

/**
 *
 * @author janri
 */
public class P3Gruppe02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    showMainFrame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void showMainFrame() {
                
        /*
        BookModel buch1 = new BookModel("BuchEins", "Mustermann", "Max", 123, true, 1.2, 1990);
        BookModel buch2 = new BookModel("BuchDos", "Musterfrau", "Maxine", 456, false, 6.7, 2021);

        BookModelList list = new BookModelList();

        list.addBook(buch1);
        list.addBook(buch2);

        String dateiName = "data/buecher.dat";

        // Bücher speichern
        BookModelListDAO dao = new BookModelListDAO(dateiName, true); // Schreiben
        try {
            dao.write(list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        dao.close();
        
        // Nun Liste von Datei wieder herstellen
        BookModelList list2 = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(dateiName, false); // Lesen
        try {
            dao2.read(list2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        dao2.close();
        */
        
        BookModelList bookModelList = new BookModelList();
        new MainFrame();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import model.BookModel;
import model.BookModelList;
import model.BookModelListDAO;

/**
 *
 * @author janri
 */
public class SouthPanelJList extends JList {

    //erstellen der einzelnen listen
    public static BookModelList list;
    private DefaultListModel listModel;

    public SouthPanelJList() {
        listModel = new DefaultListModel();
        list = new BookModelList();
    }

    // Das neu erstellte buch zur BookModelList hinzufügen
    public void addToList(BookModel book) {
        list.addBook(book);
        displayList();
    }

    //liste mit allen elementen innerhalb der BookModelList anzeigen
    public void displayList() {
        setModel(listModel);
        listModel.removeAllElements();
        for (BookModel b : list.bookModelList) {

            listModel.addElement(b.getTitel() + ", "
                    + b.getAutorName() + ", "
                    + b.getAutorVorname() + ", "
                    + b.getErscheinungsjahr() + ", "
                    + b.getSeitenanzahl() + ", "
                    + b.getBewertung() + ", "
                    + b.getGelesen());

        }
    }

}

package controller.WindowController;

import controller.MenuBar.ExportNewFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import model.BookModelList;
import model.BookModelListDAO;
import view.MainFrames.SouthPanel;
import view.MainFrames.SouthPanelJTable;
import static view.MainFrames.SouthPanelJTable.list;

public class WindowEventHandler extends WindowAdapter {

    // pfad zum file welche automatisch eingelesen und gespeichert wird 
    private String filePath = "./data/main.txt";

    public void windowClosing(WindowEvent e) {
        System.out.println("exit");

        // Speichern in DOA on Close
        BookModelListDAO dao = new BookModelListDAO(filePath, true); // Schreiben
        try {
            dao.write(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao.close();

        System.exit(0);
    }

    // bei window start datei einlesen
    public void windowOpened(WindowEvent we) {

        BookModelListDAO dao2 = new BookModelListDAO(filePath, false); // Lesen
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();

        //bestehende list mit gelesener list überschreiben und darstellen
        SouthPanelJTable.list = list;
        SouthPanel.JlistTabelle.addRowtoTable();
    }
}

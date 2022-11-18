package controller.WindowController;

import controller.MenuBar.ExportNewFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import model.BookModelListDAO;
import view.MainFrames.SouthPanel;
import view.MainFrames.SouthPanelJTable;
import static view.MainFrames.SouthPanelJTable.list;
import view.PopUpWindows.WindowClosingSaveQuestionOptionPane;


public class WindowEventHandler extends WindowAdapter {

    // pfad zum file welche automatisch eingelesen und gespeichert wird 
    private String filePath = "./data/main.txt";

    public void windowClosing(WindowEvent e) {

        WindowClosingSaveQuestionOptionPane quest = new WindowClosingSaveQuestionOptionPane();

        //Beenden
        System.out.println("exit");
        System.exit(0);
    }

    // bei window start datei einlesen
    public void windowOpened(WindowEvent we) {

        BookModelListDAO daoRead = new BookModelListDAO(filePath, false); // Lesen
        try {
            daoRead.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        daoRead.close();

        //bestehende list mit gelesener list überschreiben und darstellen
        SouthPanelJTable.list = list;
        SouthPanel.JlistTabelle.addRowtoTable();
    }

}

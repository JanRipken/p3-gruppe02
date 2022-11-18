package controller.WindowController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import controller.MenuBar.ImportNewFile;

public class WindowEventHandler extends WindowAdapter {

    // pfad zum file welche automatisch eingelesen und gespeichert wird 
    private String filePath = "./data/main.txt";

    // bei window start datei einlesen
    public void windowOpened(WindowEvent we) {

        ImportNewFile newImp = new ImportNewFile();
        newImp.importFile(filePath);
    }

}

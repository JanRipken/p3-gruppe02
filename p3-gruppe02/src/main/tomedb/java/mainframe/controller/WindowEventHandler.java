package main.tomedb.java.mainframe.controller;

import main.tomedb.java.mainframe.controller.menubar.ImportNewFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class WindowEventHandler extends WindowAdapter {

    // pfad zum file welche automatisch eingelesen und gespeichert wird 
    private String filePath = "./data/main.txt";

    // bei window start datei einlesen
    public void windowOpened(WindowEvent we) {
        ImportNewFile newImp = new ImportNewFile();
        newImp.importFile(filePath);
    }

}

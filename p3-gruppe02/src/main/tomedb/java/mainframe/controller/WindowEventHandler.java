package main.tomedb.java.mainframe.controller;

import main.tomedb.java.mainframe.controller.menubar.main.ImportNewFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventHandler extends WindowAdapter {

    private String filePath = "./data/main.txt";

    public void windowOpened(WindowEvent we) {
        ImportNewFile newImp = new ImportNewFile();
        newImp.importFile(filePath);
    }

}

package main.tomedb.java.mainframe.controller;

import main.tomedb.java.mainframe.controller.menubar.ImportNewFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventHandler extends WindowAdapter {

    /**
     * @param filePath the main path for our first import
     */
    private String filePath = "./data/main.txt";

    // on window start read in file
    public void windowOpened(WindowEvent we) {
        ImportNewFile newImp = new ImportNewFile();
        newImp.importFile(filePath);
    }

}

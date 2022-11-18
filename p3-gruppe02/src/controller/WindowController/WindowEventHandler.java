package controller.WindowController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import view.PopUpWindows.WindowClosingSaveQuestionOptionPane;
import controller.MenuBar.ImportNewFile;

public class WindowEventHandler extends WindowAdapter {

    // pfad zum file welche automatisch eingelesen und gespeichert wird 
    private String filePath = "./data/main.txt";
    public static boolean changedTable = false;

    public void windowClosing(WindowEvent e) {
        if (changedTable == true) {
            WindowClosingSaveQuestionOptionPane quest = new WindowClosingSaveQuestionOptionPane();
        }

        //Beenden
        System.out.println("exit");
        System.exit(0);
    }

    // bei window start datei einlesen
    public void windowOpened(WindowEvent we) {

        ImportNewFile newImp = new ImportNewFile();
        newImp.importFile(filePath);
    }

}

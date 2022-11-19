package main.tomedb.java.mainframe.controller.menubar;

import main.tomedb.java.mainframe.controller.WindowEventHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.menubar.Menu;
import static main.tomedb.java.mainframe.view.Table.list;

import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.controller.WindowEventHandler;

public class ExportNewFile implements ActionListener {

    // TODO: Was machen die Konstruktoren ?
    public ExportNewFile(Menu aThis) {

    }

    public ExportNewFile(WindowEventHandler aThis) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //export dialog
        JFileChooser fileExporter = new JFileChooser("./data");
        fileExporter.setDialogTitle("Speichern unter");

        int userSelection = fileExporter.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileExporter.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }

        //datei als txt unter gewähltem pfad schreiben
        String dateiName = fileExporter.getSelectedFile().getAbsolutePath() + ".txt";
        BookModelListDAO dao = new BookModelListDAO(dateiName, true); // Schreiben
        try {
            dao.write(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao.close();
    }
}

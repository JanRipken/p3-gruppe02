package controller.MenuBar;

import controller.WindowController.WindowEventHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import model.BookModelListDAO;
import view.MainFrames.JMenu.FileMenuBarMenu;
import static view.MainFrames.SouthPanelJTable.list;

import javax.swing.JFileChooser;

public class ExportNewFile implements ActionListener {

    public ExportNewFile(FileMenuBarMenu aThis) {

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

        System.out.println("Die CSV File wurde exportiert");
        System.out.println(e.getActionCommand());
    }
}

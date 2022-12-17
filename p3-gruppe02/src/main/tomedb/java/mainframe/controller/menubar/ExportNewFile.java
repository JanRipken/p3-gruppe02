package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import static main.tomedb.java.mainframe.view.Table.list;
import javax.swing.JFileChooser;

public class ExportNewFile implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        // export dialog
        JFileChooser fileExporter = new JFileChooser("./data");
        fileExporter.setDialogTitle("Speichern unter");

        int userSelection = fileExporter.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {



            // Write our file to the destined Path
            String dateiName = fileExporter.getSelectedFile().getAbsolutePath();
            BookModelListDAO dao = new BookModelListDAO(dateiName, true); // Schreiben
            try {
                dao.write(list);
            } catch (IOException v) {
                System.out.println(v.getMessage());
            }
            dao.close();
        }

    }
}

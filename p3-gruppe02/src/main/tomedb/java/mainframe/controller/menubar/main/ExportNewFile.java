package main.tomedb.java.mainframe.controller.menubar.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import static main.tomedb.java.mainframe.view.Table.list;
import javax.swing.JFileChooser;

public class ExportNewFile implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser fileExporter = new JFileChooser("./data");
        fileExporter.setDialogTitle("Speichern unter");

        int userSelection = fileExporter.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {

            String dateiName = fileExporter.getSelectedFile().getAbsolutePath();
            BookModelListDAO dao = new BookModelListDAO(dateiName, true);
            try {
                dao.write(list);
            } catch (IOException v) {
                System.out.println(v.getMessage());
            }
            dao.close();
        }

    }
}

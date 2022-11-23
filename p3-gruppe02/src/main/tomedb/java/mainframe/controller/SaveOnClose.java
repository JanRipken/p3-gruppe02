package main.tomedb.java.mainframe.controller;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import static main.tomedb.java.mainframe.view.Table.list;
import main.tomedb.java.mainframe.controller.menubar.ImportNewFile;

/**
 *
 * @author janri
 */
public class SaveOnClose extends JFrame {

    private String filePath = "./data/main.txt";

    String updatedPath = ImportNewFile.updatedpath;

    public SaveOnClose() {

        int selected = JOptionPane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern ?",
                "Speichern",
                JOptionPane.YES_NO_OPTION);

        if (selected == 0) {
            if (updatedPath != null) {
                // Speichern in DOA on Close
                BookModelListDAO daoWrite = new BookModelListDAO(updatedPath, true); // Schreiben
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.out.println(v.getMessage());
                }
                daoWrite.close();
            } else {
                // Speichern in DOA on Close
                BookModelListDAO daoWrite = new BookModelListDAO(filePath, true); // Schreiben
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.out.println(v.getMessage());
                }
                daoWrite.close();
            }

        }

    }

}

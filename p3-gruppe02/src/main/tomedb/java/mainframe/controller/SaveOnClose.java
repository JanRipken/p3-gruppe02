package main.tomedb.java.mainframe.controller;

import java.io.IOException;
import javax.swing.JOptionPane;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import static main.tomedb.java.mainframe.view.Table.list;
import main.tomedb.java.mainframe.controller.menubar.main.ImportNewFile;

public class SaveOnClose {

    private String filePath = "./data/main";

    String updatedPath = ImportNewFile.updatedpath;

    public SaveOnClose() {

        int selected = JOptionPane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern ?",
                "Speichern",
                JOptionPane.YES_NO_OPTION);

        if (selected == 0) {

            if (updatedPath != null) {

                BookModelListDAO daoWrite = new BookModelListDAO(updatedPath, true);
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                daoWrite.close();
            } else {

                BookModelListDAO daoWrite = new BookModelListDAO(filePath, true);
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                daoWrite.close();
            }
        }
    }
}

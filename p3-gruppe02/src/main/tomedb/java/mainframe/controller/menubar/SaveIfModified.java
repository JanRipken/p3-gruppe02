package main.tomedb.java.mainframe.controller.menubar;

import java.io.IOException;
import javax.swing.JOptionPane;
import main.tomedb.java.main.TomeDB;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportNewFileAction;
import main.tomedb.java.mainframe.view.MainPanel;


public class SaveIfModified {

    private BookModelList bookModelList = MainPanel.table.bookModelList;
    
    private String updatedPath = ImportNewFileAction.updatedPath;

    /**
     * Initalisiert speichern dialog.
     * Speicherort abhängig vom zuletzt verwendeten pfad
     */
    public SaveIfModified() {

        int selected = JOptionPane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern ?",
                "Speichern",
                JOptionPane.YES_NO_OPTION);

        if (selected == 0) {

            if (updatedPath != null) {

                BookModelListDAO daoWrite = new BookModelListDAO(updatedPath, true);
                try {
                    daoWrite.write(bookModelList);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                daoWrite.close();
            } else {

                BookModelListDAO daoWrite = new BookModelListDAO(TomeDB.filePath, true);
                try {
                    daoWrite.write(bookModelList);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                daoWrite.close();
            }
        }
    }
}

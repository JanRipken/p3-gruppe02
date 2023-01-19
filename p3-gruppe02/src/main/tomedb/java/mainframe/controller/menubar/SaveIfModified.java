package main.tomedb.java.mainframe.controller.menubar;

import java.io.IOException;
import javax.swing.JOptionPane;
import main.tomedb.java.main.TomeDB;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportFileAction;
import main.tomedb.java.mainframe.view.MainPanel;


public class SaveIfModified {

    private BookModelList bookModelList = MainPanel.table.bookModelList;
    
    private String updatedPath = ImportFileAction.updatedPath;

    /**
     * Initalisiert speichern dialog.
     * Speicherort abhängig vom zuletzt verwendeten pfad
     */
    public SaveIfModified() {

        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern?",
                "Speichern",
                JOptionPane.YES_NO_OPTION);

        if (selectedOption == 0) {

            if (updatedPath != null) {

                BookModelListDAO bookModelListDAO = new BookModelListDAO(updatedPath, true);
                try {
                    bookModelListDAO.write(bookModelList);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                bookModelListDAO.close();
            } else {

                BookModelListDAO bookModelListDAO = new BookModelListDAO(TomeDB.filePath, true);
                try {
                    bookModelListDAO.write(bookModelList);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                bookModelListDAO.close();
            }
        }
    }
}

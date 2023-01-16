package main.tomedb.java.mainframe.controller.menubar;

import java.io.IOException;
import javax.swing.JOptionPane;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportNewFileAction;
import static main.tomedb.java.mainframe.view.Table.bookModelList;

public class SaveOnCloseAction {

    private String filePath = "./data/main";

    String updatedPath = ImportNewFileAction.updatedPath;

    public SaveOnCloseAction() {

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

                BookModelListDAO daoWrite = new BookModelListDAO(filePath, true);
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
package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import static main.tomedb.java.mainframe.controller.menubar.CloseMainFrameAction.changedTableState;
import main.tomedb.java.mainframe.controller.menubar.SaveIfModified;

public class CreateFileAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (changedTableState == true) {
            new SaveIfModified();
        }
        JFileChooser fileCreator = new JFileChooser("./data");
        fileCreator.setDialogTitle("Neue Datei erstellen");

        int userSelection = fileCreator.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File newFile = fileCreator.getSelectedFile();
            try {
                newFile.createNewFile();
                ImportNewFileAction.updatedPath = newFile.getAbsolutePath();
                ImportNewFileAction importNewFileAction = new ImportNewFileAction();
                importNewFileAction.importFile(ImportNewFileAction.updatedPath);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

}

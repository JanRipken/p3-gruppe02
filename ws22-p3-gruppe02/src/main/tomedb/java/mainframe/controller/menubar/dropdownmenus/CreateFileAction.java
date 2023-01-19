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
        createFile();

    }

    private void createFile() {
        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Neue Datei erstellen");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                file.createNewFile();
                ImportFileAction.updatedPath = file.getAbsolutePath();
                ImportFileAction importNewFileAction = new ImportFileAction();
                importNewFileAction.importFile(ImportFileAction.updatedPath);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.mainframe.controller.jtable.ChangeTableStateListener;
import main.tomedb.java.mainframe.view.MainPanel;

/**
 *
 * @author alex-
 */

public class CreateFileAction implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileCreator = new JFileChooser("./data");
        fileCreator.setDialogTitle("Neue Datei erstellen");

        int userSelection = fileCreator.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File newFile = fileCreator.getSelectedFile();
            try {
                newFile.createNewFile();
                ImportNewFileAction.updatedPath = newFile.getAbsolutePath();
                importFile(ImportNewFileAction.updatedPath);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    public void importFile(String path) {
        ChangeTableStateListener TableListener = MainPanel.tableListener;

        MainPanel.table.defaultTableMode.removeTableModelListener(TableListener);

        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(path, false);
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.err.println(v.getMessage());
        }
        dao2.close();

        MainPanel.table.bookModelList = list;

        MainPanel.table.tableController.addRowtoTable();

        MainPanel.table.defaultTableMode.addTableModelListener(TableListener);

    }
}

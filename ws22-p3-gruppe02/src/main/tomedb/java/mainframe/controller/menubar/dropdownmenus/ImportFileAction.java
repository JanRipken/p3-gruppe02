package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.controller.jtable.ChangeTableStateListener;
import static main.tomedb.java.mainframe.controller.menubar.CloseMainFrameAction.changedTableState;
import main.tomedb.java.mainframe.controller.menubar.SaveIfModified;
import main.tomedb.java.mainframe.view.MainPanel;

public class ImportFileAction extends Table implements ActionListener {

    public static String updatedPath;
    private String fileName;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (changedTableState == true) {
            new SaveIfModified();
        }
        
        
        
        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {

            updatedPath = "./data/" + fileChooser.getSelectedFile().getName();

            fileName = fileChooser.getSelectedFile().getAbsolutePath();

            importFile(fileName);

        }
    }

    public void importFile(String path) {
        ChangeTableStateListener TableListener = MainPanel.tableListener;

        MainPanel.table.defaultTableMode.removeTableModelListener(TableListener);

        BookModelList bookModelList = new BookModelList();
        BookModelListDAO bookModelListDAO = new BookModelListDAO(path, false);
        try {
            bookModelListDAO.read(bookModelList);
        } catch (IOException v) {
            
        }
        bookModelListDAO.close();

        MainPanel.table.bookModelList = bookModelList;
        
        MainPanel.table.tableAdditor.rebuildTableRows();

        MainPanel.table.defaultTableMode.addTableModelListener(TableListener);

    }
}
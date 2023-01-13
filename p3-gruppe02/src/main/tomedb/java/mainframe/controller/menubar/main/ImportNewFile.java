package main.tomedb.java.mainframe.controller.menubar.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.controller.jtable.TableModified;
import main.tomedb.java.mainframe.view.MainPanel;

public class ImportNewFile extends Table implements ActionListener {

    public static String updatedPath;
    String fileName;

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            updatedPath = "./data/" + fileChooser.getSelectedFile().getName();

            fileName = fileChooser.getSelectedFile().getAbsolutePath();

            importFile(fileName);

        }
    }

    public void importFile(String path) {
        TableModified TableListener = MainPanel.tableListener;

        MainPanel.table.defaultTableMode.removeTableModelListener(TableListener);

        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(path, false);
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.err.println(v.getMessage());
        }
        dao2.close();

        Table.bookModelList = list;
        MainPanel.table.addRowtoTable();

        MainPanel.table.defaultTableMode.addTableModelListener(TableListener);

    }
}
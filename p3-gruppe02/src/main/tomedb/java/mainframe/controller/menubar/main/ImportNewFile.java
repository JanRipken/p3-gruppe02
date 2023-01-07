package main.tomedb.java.mainframe.controller.menubar.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.controller.jtable.Changed;
import main.tomedb.java.mainframe.view.MainPanel;

public class ImportNewFile extends Table implements ActionListener {

    public static String updatedpath;
    String dateiName;

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            updatedpath = "./data/" + fileChooser.getSelectedFile().getName();

            dateiName = fileChooser.getSelectedFile().getAbsolutePath();

            importFile(dateiName);

        }

    }

    public void importFile(String path) {
        Changed TableListener = MainPanel.TableListener;

        MainPanel.JlistTabelle.model.removeTableModelListener(TableListener);

        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(path, false);
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();

        Table.list = list;
        MainPanel.JlistTabelle.addRowtoTable();

        MainPanel.JlistTabelle.model.addTableModelListener(TableListener);

    }
}

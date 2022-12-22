package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.menubar.Menu;

import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.controller.JTableChanged;
import main.tomedb.java.mainframe.view.MainPanel;

public class ImportNewFile extends Table implements ActionListener {

    public static String updatedpath;
    String dateiName;

    @Override
    public void actionPerformed(ActionEvent e) {

        // Import Dialog

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

             // After importing use the Updated path
        updatedpath = "./data/" + fileChooser.getSelectedFile().getName();

        // Read file
        dateiName = fileChooser.getSelectedFile().getAbsolutePath();

        importFile(dateiName);
            
        }

       
    }

    public void importFile(String path) {
        // Read file
        JTableChanged TableListener = MainPanel.TableListener;

        // discard old Table listener
        MainPanel.JlistTabelle.model.removeTableModelListener(TableListener);

        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(path, false); // Lesen
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();

        // Write new lost over old List
        Table.list = list;
        MainPanel.JlistTabelle.addRowtoTable();

        // Activate a new Table listener
        MainPanel.JlistTabelle.model.addTableModelListener(TableListener);

    }
}

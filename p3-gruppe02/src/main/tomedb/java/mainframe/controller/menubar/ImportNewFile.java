package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.view.menubar.Menu;
import main.tomedb.java.mainframe.view.SouthPanel;
import main.tomedb.java.mainframe.view.Table;
import main.tomedb.java.mainframe.controller.JTableChanged;

public class ImportNewFile extends Table implements ActionListener {

    public static String updatedpath;
    String dateiName;

    @Override
    public void actionPerformed(ActionEvent e) {

        // Import Dialog
        // TODO JFile chooser ist eine view
        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Sie haben folgende Datei ausgewählt: "
                    + fileChooser.getSelectedFile().getName());
        }

        // After importing use the Updated path
        updatedpath = "./data/" + fileChooser.getSelectedFile().getName();

        // Read file
        dateiName = fileChooser.getSelectedFile().getAbsolutePath();

        importFile(dateiName);
    }

    public void importFile(String path) {
        // Read file
        JTableChanged TableListener = SouthPanel.TableListener;

        // discard old Table listener
        SouthPanel.JlistTabelle.model.removeTableModelListener(TableListener);

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
        SouthPanel.JlistTabelle.addRowtoTable();

        // Activate a new Table listener
        SouthPanel.JlistTabelle.model.addTableModelListener(TableListener);

    }
}

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
import main.tomedb.java.mainframe.controller.JTableChanged;

public class ImportNewFile extends Table implements ActionListener {

    public static String updatedpath;
    String dateiName;

    //TODO: ??
    public ImportNewFile(Menu aThis) {
    }

    public ImportNewFile() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Import Dialog
        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu importierende Datei");
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Sie haben folgende Datei ausgewählt: "
                    + fileChooser.getSelectedFile().getName());
        }

        // pfad des importierten files um es später dort wieder abzuspeichern
        updatedpath = "./data/" + fileChooser.getSelectedFile().getName();

        //Datei lesen
        dateiName = fileChooser.getSelectedFile().getAbsolutePath();

        importFile(dateiName);
    }

    public void importFile(String path) {
        //Datei lesen
        JTableChanged TableListener = SouthPanel.TableListener;
        SouthPanel.JlistTabelle.model.removeTableModelListener(TableListener);

        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(path, false); // Lesen
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();

        //bestehende list mit gelesener list überschreiben und darstellen
        Table.list = list;
        SouthPanel.JlistTabelle.addRowtoTable();

        // Aktivieren des Table listeners beim importieren eines neuen files
        SouthPanel.JlistTabelle.model.addTableModelListener(TableListener);

    }
}

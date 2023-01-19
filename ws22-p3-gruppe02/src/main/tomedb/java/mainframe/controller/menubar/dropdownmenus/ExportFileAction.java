package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import javax.swing.JFileChooser;
import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;

public class ExportFileAction implements ActionListener {

    private BookModelList bookModelList;
    private JFileChooser fileChooser ;

    @Override
    public void actionPerformed(ActionEvent e) {
        bookModelList = MainPanel.table.bookModelList;
        fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Speichern unter");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            exportDAO(); 
        }
    }

    private void exportDAO() {
        String fileName = fileChooser.getSelectedFile().getAbsolutePath();
        BookModelListDAO dao = new BookModelListDAO(fileName, true);
        try {
            dao.write(bookModelList);
        } catch (IOException v) {
            System.err.println(v.getMessage());
        }
        dao.close();
    }

}

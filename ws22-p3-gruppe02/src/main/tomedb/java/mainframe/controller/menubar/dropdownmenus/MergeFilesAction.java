package main.tomedb.java.mainframe.controller.menubar.dropdownmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.controller.dao.BookModelListDAO;
import main.tomedb.java.main.model.BookModelList;
import static main.tomedb.java.mainframe.controller.menubar.CloseMainFrameAction.changedTableState;
import main.tomedb.java.mainframe.controller.menubar.SaveIfModified;
import main.tomedb.java.mainframe.view.MainPanel;

public class MergeFilesAction implements ActionListener {

    private BookModelList bookModelList;
    private DefaultListModel defaultListModel;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTableState == true) {
            new SaveIfModified();
        }
        bookModelList = new BookModelList();

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu Mergenden Datein");
        FileChooserExtension selectedListsExtension = new FileChooserExtension(fileChooser);
        fileChooser.setAccessory(selectedListsExtension);
        int open = fileChooser.showOpenDialog(fileChooser);

        if (open == JFileChooser.APPROVE_OPTION) {
            defaultListModel = selectedListsExtension.getModel();
            merge();
        }
    }

    private void merge() {
        for (int i = 0; i < defaultListModel.getSize(); i++) {
            String path = defaultListModel.getElementAt(i).toString();

            BookModelListDAO bookModelListDAO = new BookModelListDAO(path, false);
            try {
                bookModelListDAO.read(bookModelList);
            } catch (IOException v) {
                System.err.println(v.getMessage());
            }
            bookModelListDAO.close();

            MainPanel.table.bookModelList = bookModelList;

            MainPanel.table.tableAdditor.rebuildTableRows();
        }
    }
}

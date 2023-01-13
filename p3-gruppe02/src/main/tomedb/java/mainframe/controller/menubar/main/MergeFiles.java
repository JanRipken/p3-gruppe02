package main.tomedb.java.mainframe.controller.menubar.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.MainPanel;
import main.tomedb.java.mainframe.view.Table;

public class MergeFiles implements ActionListener {

    public static BookModelList list;

    @Override
    public void actionPerformed(ActionEvent e) {

        list = new BookModelList();

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu Mergenden Datein");
        FileChooserExtension selectedListsExtension = new FileChooserExtension(fileChooser);
        fileChooser.setAccessory(selectedListsExtension);
        int open = fileChooser.showOpenDialog(fileChooser);

        if (open == JFileChooser.APPROVE_OPTION) {
            DefaultListModel model = selectedListsExtension.getModel();
            for (int i = 0; i < model.getSize(); i++) {
                String path = model.getElementAt(i).toString();

                BookModelListDAO dao2 = new BookModelListDAO(path, false);
                try {
                    dao2.read(list);
                } catch (IOException v) {
                    System.err.println(v.getMessage());
                }
                dao2.close();
                Table.bookModelList = list;
                MainPanel.table.addRowtoTable();
            }
        }
    }
}

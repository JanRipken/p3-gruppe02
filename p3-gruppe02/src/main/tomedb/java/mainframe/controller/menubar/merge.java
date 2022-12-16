package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import main.tomedb.java.mainframe.controller.JTableChanged;
import main.tomedb.java.mainframe.dao.BookModelListDAO;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.view.SouthPanel;
import main.tomedb.java.mainframe.view.Table;

public class merge implements ActionListener {

    public static BookModelList list;

 
    public void actionPerformed(ActionEvent e) {

        list = new BookModelList();

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Wählen sie die zu Mergenden Datein");
        FileListAccessory accessory = new FileListAccessory(fileChooser);
        fileChooser.setAccessory(accessory);
        int open = fileChooser.showOpenDialog(fileChooser);

        if (open == JFileChooser.APPROVE_OPTION) {
            DefaultListModel model = accessory.getModel();
            for (int i = 0; i < model.getSize(); i++) {
                String path = model.getElementAt(i).toString();

                BookModelListDAO dao2 = new BookModelListDAO(path, false);
                try {
                    dao2.read(list);
                } catch (IOException v) {
                    System.out.println(v.getMessage());
                }
                dao2.close();
                Table.list = list;
                SouthPanel.JlistTabelle.addRowtoTable();
            }

        }


    }

}

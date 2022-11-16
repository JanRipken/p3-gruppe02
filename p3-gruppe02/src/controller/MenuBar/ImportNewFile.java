/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import model.BookModelList;
import model.BookModelListDAO;
import view.MainFrames.JMenu.FileMenuBarMenu;
import view.MainFrames.SouthPanel;
import view.MainFrames.SouthPanelJList;

/**
 *
 * @author alex-
 */
public class ImportNewFile extends SouthPanelJList implements ActionListener {

    public ImportNewFile(FileMenuBarMenu aThis) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser("./data");
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Sie haben folgende Datei ausgewählt: "
                    + chooser.getSelectedFile().getName());

        }

        String dateiName = chooser.getSelectedFile().getAbsolutePath();
        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(dateiName, false); // Lesen
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();

        SouthPanelJList.list = list;
        SouthPanel.JlistTabelle.displayList();

    }
}

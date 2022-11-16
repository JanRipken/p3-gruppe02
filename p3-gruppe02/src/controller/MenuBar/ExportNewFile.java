package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import model.BookModelListDAO;
import view.MainFrames.JMenu.FileMenuBarMenu;
import view.MainFrames.SouthPanelJList;
import static view.MainFrames.SouthPanelJList.list;
/**
 *
 * @author alex-
 */

import javax.swing.JFileChooser;

public class ExportNewFile implements ActionListener {

    public ExportNewFile(FileMenuBarMenu aThis) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        JFileChooser fileChooser = new JFileChooser("./data");
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }

        String dateiName = fileChooser.getSelectedFile().getAbsolutePath() + ".txt";
        BookModelListDAO dao = new BookModelListDAO(dateiName, true); // Schreiben
        try {
            dao.write(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao.close();

        System.out.println("Die CSV File wurde exportiert");
        System.out.println(e.getActionCommand());
    }
}

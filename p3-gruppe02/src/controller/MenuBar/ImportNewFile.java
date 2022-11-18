
package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import model.BookModelList;
import model.BookModelListDAO;
import view.MainFrames.JMenu.FileMenuBarMenu;
import view.MainFrames.SouthPanel;
import view.MainFrames.SouthPanelJTable;

/**
 *
 * @author alex-
 */
public class ImportNewFile extends SouthPanelJTable implements ActionListener {
    public static String updatedpath;
    public ImportNewFile(FileMenuBarMenu aThis) {
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
        updatedpath = "./data/"+fileChooser.getSelectedFile().getName();
        //Datei lesen

        String dateiName = fileChooser.getSelectedFile().getAbsolutePath();
        
        BookModelList list = new BookModelList();
        BookModelListDAO dao2 = new BookModelListDAO(dateiName, false); // Lesen
        try {
            dao2.read(list);
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
        dao2.close();
        
        //bestehende list mit gelesener list überschreiben und darstellen
        SouthPanelJTable.list = list;
        SouthPanel.JlistTabelle.addRowtoTable();
        
    }
}

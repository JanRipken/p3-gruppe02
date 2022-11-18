package controller.MenuBar;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFileChooser;
import model.BookModelList;
import model.BookModelListDAO;
import view.MainFrames.JMenu.FileMenuBarMenu;
import view.MainFrames.SouthPanel;
import view.MainFrames.SouthPanelJTable;
import controller.MainFrame.JTableListener;

/**
 *
 * @author alex-
 */
public class ImportNewFile extends SouthPanelJTable implements ActionListener {

    public static String updatedpath;
    String dateiName;

    public ImportNewFile(FileMenuBarMenu aThis) {
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

    public void importFile(String path){
        //Datei lesen
        JTableListener TableListener = SouthPanel.TableListener;  
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
        SouthPanelJTable.list = list;
        SouthPanel.JlistTabelle.addRowtoTable();
        
        
        SouthPanel.JlistTabelle.model.addTableModelListener(TableListener);
        
    }
}

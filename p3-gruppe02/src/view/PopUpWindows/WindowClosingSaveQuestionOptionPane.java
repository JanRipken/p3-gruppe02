package view.PopUpWindows;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.BookModelListDAO;
import static view.MainFrames.SouthPanelJTable.list;
import controller.MenuBar.ImportNewFile;

/**
 *
 * @author janri
 */
public class WindowClosingSaveQuestionOptionPane extends JFrame {

    private String filePath = "./data/main.txt";
    
    JOptionPane pane;
    String updatedPath = ImportNewFile.updatedpath;

    public WindowClosingSaveQuestionOptionPane() {

        int selected = pane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern ?",
                "Speichern",
                pane.YES_NO_OPTION);

 
        if (selected == 0 ) {
            if (updatedPath != null) {
                // Speichern in DOA on Close
                BookModelListDAO daoWrite = new BookModelListDAO(updatedPath, true); // Schreiben
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.out.println(v.getMessage());
                }
                daoWrite.close();
            } else {
                // Speichern in DOA on Close
                BookModelListDAO daoWrite = new BookModelListDAO(filePath, true); // Schreiben
                try {
                    daoWrite.write(list);
                } catch (IOException v) {
                    System.out.println(v.getMessage());
                }
                daoWrite.close();
            }

        }

    }

}

package view.closeWindow;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.BookModel;
import model.BookModelListDAO;
import static view.MainFrames.SouthPanelJTable.list;
import view.MainFrames.SouthPanelJTable;

/**
 *
 * @author janri
 */
public class WindowClosingSaveQuestionOptionPane extends JFrame {

  
    private String filePath = "./data/main.txt";
    JOptionPane pane;

    public WindowClosingSaveQuestionOptionPane() {
        int selected = pane.showConfirmDialog(null,
                "Möchten sie ihr Liste Speichern ?",
                "Speichern",
                pane.YES_NO_OPTION);

        if (selected == 0) {
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

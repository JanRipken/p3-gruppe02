package main.tomedb.java.main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.themes.SetTheme;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportNewFileAction;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {

    public static MainFrame mainFrame;
    private static String filePath = "./data/main";

    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

            /**
             * Setzten des Look and Feels auf nimbus und abfragen ob bereits ein design gesetzt wurde
             * Starten des Main Frames
             */
            @Override
            public void run() {
                try {

                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    new SetTheme();
                    showMainFrame();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    private static void showMainFrame() {
        mainFrame = new MainFrame();
        importOnStart();
    }

    private static void importOnStart() {
        ImportNewFileAction newImp = new ImportNewFileAction();
        newImp.importFile(filePath);
    }
}

package main.tomedb.java.main;

import main.tomedb.java.designtemplate.themes.DarkTheme;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.designtemplate.themes.LightTheme;
import main.tomedb.java.designtemplate.themes.SetTheme;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportNewFileAction;
import main.tomedb.java.mainframe.controller.settings.ReadWriteAction;
import main.tomedb.java.mainframe.view.MainFrame;

public class TomeDB {

    public static MainFrame mainFrame;
    private static String filePath = "./data/main";

    public static void main(String[] args) throws ClassNotFoundException {

        SwingUtilities.invokeLater(new Runnable() {

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

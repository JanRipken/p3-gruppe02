package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.main.ExportNewFile;
import main.tomedb.java.mainframe.controller.menubar.main.ImportNewFile;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import main.tomedb.java.mainframe.controller.menubar.main.MergeFiles;
import main.tomedb.java.mainframe.view.MainFrame;

public class BuildFileDropDownMenu{

    private ImageIcon importIcon;
    private ImageIcon exportIcon;
    private ImageIcon mergeIcon;

    private JMenu fileDropDownMenu;

    protected BuildFileDropDownMenu() {

        fileDropDownMenu = new JMenu("Datein");

        importIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/import.png", 15, 15);

        exportIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/export.png", 15, 15);

        mergeIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/merge.png", 15, 15);

        JMenuItem importFile = new JMenuItem("Importieren");
        JMenuItem exportFile = new JMenuItem("Exportieren");
        JMenuItem mergeFiles = new JMenuItem("Zusammenführen");

        fileDropDownMenu.add(importFile);
        fileDropDownMenu.add(exportFile);
        fileDropDownMenu.add(mergeFiles);

        importFile.setIcon(importIcon);
        exportFile.setIcon(exportIcon);
        mergeFiles.setIcon(mergeIcon);

        ImportNewFile importNewFileAction = new ImportNewFile();
        importFile.addActionListener(importNewFileAction);

        ExportNewFile exportNewFileAction = new ExportNewFile();
        exportFile.addActionListener(exportNewFileAction);

        MergeFiles mergeFilesAction = new MergeFiles();
        mergeFiles.addActionListener(mergeFilesAction);

    }

    public JMenu returnFileDropDownMenu() {

        return fileDropDownMenu;
    }
}

package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ExportNewFileAction;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportNewFileAction;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.MergeFilesAction;
import main.tomedb.java.mainframe.view.MainFrame;

class BuildFileDropDownMenu{

    private ImageIcon importIcon;
    private ImageIcon exportIcon;
    private ImageIcon mergeIcon;

    private JMenu fileDropDownMenu;

    BuildFileDropDownMenu() {

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

        ImportNewFileAction importNewFileAction = new ImportNewFileAction();
        importFile.addActionListener(importNewFileAction);

        ExportNewFileAction exportNewFileAction = new ExportNewFileAction();
        exportFile.addActionListener(exportNewFileAction);

        MergeFilesAction mergeFilesAction = new MergeFilesAction();
        mergeFiles.addActionListener(mergeFilesAction);

    }

    protected JMenu returnFileDropDownMenu() {

        return fileDropDownMenu;
    }
}

package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ExportFileAction;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ImportFileAction;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.CreateFileAction;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.MergeFilesAction;
import main.tomedb.java.mainframe.view.MainFrame;

class BuildFileDropDownMenu{

    private ImageIcon createIcon;
    private ImageIcon importIcon;
    private ImageIcon exportIcon;
    private ImageIcon mergeIcon;

    private JMenu fileDropDownMenu;

    BuildFileDropDownMenu() {

        fileDropDownMenu = new JMenu("Datei");

        createIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/create.png", 15, 15);
        
        importIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/import.png", 15, 15);

        exportIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/export.png", 15, 15);

        mergeIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/merge.png", 15, 15);

        
        JMenuItem createFile = new JMenuItem("Neue Liste");
        JMenuItem importFile = new JMenuItem("Importieren");
        JMenuItem exportFile = new JMenuItem("Exportieren");
        JMenuItem mergeFiles = new JMenuItem("Zusammenführen");
        
        fileDropDownMenu.add(createFile);
        fileDropDownMenu.add(importFile);
        fileDropDownMenu.add(exportFile);
        fileDropDownMenu.add(mergeFiles);
        
        createFile.setIcon(createIcon);
        importFile.setIcon(importIcon);
        exportFile.setIcon(exportIcon);
        mergeFiles.setIcon(mergeIcon);

        ImportFileAction importNewFileAction = new ImportFileAction();
        importFile.addActionListener(importNewFileAction);

        ExportFileAction exportNewFileAction = new ExportFileAction();
        exportFile.addActionListener(exportNewFileAction);

        MergeFilesAction mergeFilesAction = new MergeFilesAction();
        mergeFiles.addActionListener(mergeFilesAction);
        
        CreateFileAction createFileAction = new CreateFileAction();
        createFile.addActionListener(createFileAction);      

    }

    protected JMenu returnFileDropDownMenu() {

        return fileDropDownMenu;
    }
}

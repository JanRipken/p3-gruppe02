package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.main.ExportNewFile;
import main.tomedb.java.mainframe.controller.menubar.main.ImportNewFile;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import main.tomedb.java.mainframe.controller.menubar.main.MergeFiles;
import main.tomedb.java.mainframe.view.MainFrame;

public class Menu extends JMenu {

    private ImageIcon importIcon;
    private ImageIcon exportIcon;
    private ImageIcon mergeIcon;

    private JMenu menu;

    protected Menu() {

        menu = new JMenu("Main Menu");

        importIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/import.png", 15, 15);

        exportIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/export.png", 15, 15);

        mergeIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/merge.png", 15, 15);

        JMenuItem ImportFile = new JMenuItem("Import");
        JMenuItem ExportFile = new JMenuItem("Export");
        JMenuItem MergeLists = new JMenuItem("Merge");

        menu.add(ImportFile);
        menu.add(ExportFile);
        menu.add(MergeLists);

        ImportFile.setIcon(importIcon);
        ExportFile.setIcon(exportIcon);
        MergeLists.setIcon(mergeIcon);

        ImportNewFile startImport = new ImportNewFile();
        ImportFile.addActionListener(startImport);

        ExportNewFile startExport = new ExportNewFile();
        ExportFile.addActionListener(startExport);

        MergeFiles merging = new MergeFiles();
        MergeLists.addActionListener(merging);

    }

    public JMenu makeJMenu() {

        return menu;
    }
}

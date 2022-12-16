/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view.menubar;

import main.tomedb.java.mainframe.controller.menubar.ExportNewFile;
import main.tomedb.java.mainframe.controller.menubar.ImportNewFile;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import main.tomedb.java.ModifyIcons;
import main.tomedb.java.mainframe.view.MainFrame;

/**
 *
 * @author janri
 */
public class Menu extends JMenu {

    private ImageIcon importIcon;
    private ImageIcon exportIcon;

    private JMenu menu;

    protected Menu() {

        menu = new JMenu("Main Menu");

        importIcon=MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/import.png",15,15);
        // getting the Import icon
 

        // getting the Export icon
        exportIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/export.png",15,15);
 

        JMenuItem ImportFile = new JMenuItem("Import");
        JMenuItem ExportFile = new JMenuItem("Export");

        menu.add(ImportFile);
        menu.add(ExportFile);

        ImportFile.setIcon(importIcon);
        ExportFile.setIcon(exportIcon);

        ImportNewFile startImport = new ImportNewFile();
        ImportFile.addActionListener(startImport);

        ExportNewFile startExport = new ExportNewFile();
        ExportFile.addActionListener(startExport);

    }

    public JMenu makeJMenu() {

        return menu;
    }
}

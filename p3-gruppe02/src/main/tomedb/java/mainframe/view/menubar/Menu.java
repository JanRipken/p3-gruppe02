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

        // getting the Import icon
        importIcon = new ImageIcon(this.getClass().getResource("/main/tomedb/ressources/icons/import.png"));
        Image image = importIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        importIcon = new ImageIcon(newimg);
        importIcon.getImage();

        // getting the Export icon
        exportIcon = new ImageIcon(this.getClass().getResource("/main/tomedb/ressources/icons/export.png"));
        Image image2 = exportIcon.getImage(); // transform it
        Image newimg2 = image2.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        exportIcon = new ImageIcon(newimg2);
        exportIcon.getImage();

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

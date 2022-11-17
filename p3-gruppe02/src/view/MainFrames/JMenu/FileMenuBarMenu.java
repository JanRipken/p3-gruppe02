/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import controller.MenuBar.ExportNewFile;
import controller.MenuBar.ImportNewFile;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author janri
 */
public class FileMenuBarMenu extends JMenu {
    
	ImageIcon importIcon;
	ImageIcon exportIcon;
    
    JMenu menu;
    protected FileMenuBarMenu(){
               
        //menu erstellen
        menu = new JMenu("Main Menu");
                 
        importIcon = new ImageIcon(this.getClass().getResource("/assets/icons/import.png"));
	exportIcon = new ImageIcon(this.getClass().getResource("/assets/icons/export.png"));
        
        
        //MenuItem
       JMenuItem ImportFile = new JMenuItem("Import");
       JMenuItem ExportFile = new JMenuItem("Export");
           
          
        //menu add
        menu.add(ImportFile);
        menu.add(ExportFile); 
        
        ImportFile.setIcon(importIcon);
	ExportFile.setIcon(exportIcon);

        //controller hinzufügen für ImportFile
        ImportNewFile startimport = new ImportNewFile(this);
        ImportFile.addActionListener(startimport);
        
        //controller hinzufügen für ImportFile
        ExportNewFile startexport = new ExportNewFile(this);
        ExportFile.addActionListener(startexport);
        
    }
           
    public JMenu makeJMenu(){
    
        return menu;
    }
}

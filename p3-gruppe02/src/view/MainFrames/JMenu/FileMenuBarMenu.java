/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import controller.MenuBar.ExportNewFile;
import controller.MenuBar.ImportNewFile;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author janri
 */
public class FileMenuBarMenu extends JMenu {
    
    JMenuItem ImportFile;
    JMenuItem ExportFile;
    
    JMenu menu;
    protected FileMenuBarMenu(){
               
        //menu erstellen
        menu = new JMenu("Main Menu");
                 
        //MenuItem
        ImportFile = new JMenuItem("Import");
        ExportFile = new JMenuItem("Export");
        
          
        //menu add
        menu.add(ImportFile);
        menu.add(ExportFile); 

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

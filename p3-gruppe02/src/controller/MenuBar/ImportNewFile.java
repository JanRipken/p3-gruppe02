/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import view.MainFrames.JMenu.FileMenuBarMenu;

/**
 *
 * @author alex-
 */ 
    public class ImportNewFile implements ActionListener {

     public ImportNewFile(FileMenuBarMenu aThis) {
    }

        @Override
        public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser("./data");
        // FileNameExtensionFilter filter = new FileNameExtensionFilter(
        // "txt", "JPG & GIF Images", "jpg", "gif", "dat");
        // chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Sie haben folgende Datei ausgewählt: "
                    + chooser.getSelectedFile().getName());
        }
    }
 }
    

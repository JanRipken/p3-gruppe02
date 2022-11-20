/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.newbookframe.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author janri
 */
public class WrongEntryOptionPane extends JFrame{
    
    public WrongEntryOptionPane(){
        String info = " Sie haben eine nicht gültige Eingabe getätigt! \n Bitte überprüfen sie ihre eingaben mithilfe der Tooltips nocheinmal!";
        
        JOptionPane.showMessageDialog(this, info);
    }
    
}

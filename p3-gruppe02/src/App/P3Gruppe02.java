/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import javax.swing.SwingUtilities;
import view.MainFrame;

/**
 *
 * @author janri
 */
public class P3Gruppe02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                try{
                    showMainFrame();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });             
    }
    public static void showMainFrame() {
        new MainFrame();
    }
        
        
        
        
 }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import java.io.IOException;
import javax.swing.SwingUtilities;
import model.BookModelList;
import view.MainFrames.MainFrame;
import java.util.Vector;
import model.BookModel;
import model.BookModelListDAO;

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
            public void run() {
                try {
                    showMainFrame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void showMainFrame() {    
        BookModelList bookModelList = new BookModelList();
        new MainFrame();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.MainFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.PopUpWindows.WindowClosingSaveQuestionOptionPane;

/**
 *
 * @author janri
 */
public class CloseMainFrame implements ActionListener {
public static boolean changedTable = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (changedTable == true) {
            WindowClosingSaveQuestionOptionPane quest = new WindowClosingSaveQuestionOptionPane();
        }

        //Beenden
        System.out.println("exit");
        System.exit(0);
    }
    
}

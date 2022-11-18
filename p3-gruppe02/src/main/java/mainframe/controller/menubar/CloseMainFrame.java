package main.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.popupwindows.view.WindowClosingSaveQuestionOptionPane;

// Controller zum schlissen des Main fester über einen Button
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

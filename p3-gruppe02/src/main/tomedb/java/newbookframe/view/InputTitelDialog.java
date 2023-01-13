package main.tomedb.java.newbookframe.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputTitelDialog extends JFrame {

    public InputTitelDialog() {
        String info = "Bitte geben sie einen Titel an";

        JOptionPane.showMessageDialog(this, info);
    }

}

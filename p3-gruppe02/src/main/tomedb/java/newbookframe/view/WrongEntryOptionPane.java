package main.tomedb.java.newbookframe.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WrongEntryOptionPane extends JFrame {

    public WrongEntryOptionPane() {
        String info = " Sie haben eine nicht gültige Eingabe getätigt! \n Bitte überprüfen sie ihre eingaben mithilfe der Tooltips nocheinmal!";

        JOptionPane.showMessageDialog(this, info);
    }

}

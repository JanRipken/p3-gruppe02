package main.tomedb.java.newbookframe.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//TODO in die main panel klasse packen 
public class Buttons extends JPanel {
    JButton ButtonBestätigen = new JButton("Bestätigen");
    JButton ButtonAbrechen = new JButton("Abrechen");

    public Buttons() {

        ButtonAbrechen.setName("ButtonAbrechenAbbrechen");
        this.setLayout(new GridLayout(1, 0));
        this.add(ButtonBestätigen);
        this.add(ButtonAbrechen);

    }
}

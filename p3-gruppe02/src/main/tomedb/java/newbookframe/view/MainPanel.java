package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {

    //LayoutButtons
    JButton ButtonBestätigen = new JButton("Bestätigen");
    JButton ButtonAbrechen = new JButton("Abrechen");

    //Layout Checkbox
    String beschreibungCheckBox = new String();
    JCheckBox CB = new JCheckBox();

    //Layout Texfield
    JTextField textfield = new JTextField();
    String beschreibungTextField = new String();

    // TODO: hier kann mehr hin eventuell die beiden layouts
    public MainPanel() {

        this.setLayout(new GridLayout(8, 0));
    }

    public void layoutTextfield(String myLabel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        beschreibungTextField = myLabel;
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(beschreibungTextField));

        this.add(borderPanel);
    }

    public void buttonsAbortOrSave() {
        ButtonAbrechen.setName("ButtonAbrechenAbbrechen");
        this.setLayout(new GridLayout(1, 0));
        this.add(ButtonBestätigen);
        this.add(ButtonAbrechen);
    }

    public void layoutCheckBox(String myLabel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        beschreibungCheckBox = myLabel;
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(CB);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(beschreibungCheckBox));

        this.add(borderPanel);
    }
}

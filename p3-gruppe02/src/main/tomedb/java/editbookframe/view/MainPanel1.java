package main.tomedb.java.editbookframe.view;

import main.tomedb.java.editbookframe.view.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Double;
import javax.swing.text.PlainDocument;
import main.tomedb.java.editbookframe.controller.DoubleFilter;
import main.tomedb.java.editbookframe.controller.IntFilter;

public class MainPanel1 extends JPanel {

    JButton ButtonBestätigen = new JButton("Bestätigen");
    JButton ButtonAbrechen = new JButton("Abrechen");

    // TODO: Layouts hierrein schreiben
    public MainPanel1() {

        this.setLayout(new GridLayout(8, 0));

    }

    public JTextField LayoutTextfield(String myLabel) {
        JTextField textfield = new JTextField();
        JPanel jpanelTexfield = new JPanel();

        jpanelTexfield.setLayout(new BoxLayout(jpanelTexfield, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(myLabel));

        this.add(borderPanel);
        return textfield;

    }

    public JTextField LayoutTextfieldInt(String myLabel) {
        JTextField textfield = new JTextField();
        JPanel jpanelTexfield = new JPanel();

        jpanelTexfield.setLayout(new BoxLayout(jpanelTexfield, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(myLabel));

        this.add(borderPanel);

        PlainDocument doc = (PlainDocument) textfield.getDocument();

        doc.setDocumentFilter(new IntFilter());
        return textfield;

    }

    public JTextField LayoutTextfieldDouble(String myLabel) {
        JTextField textfield = new JTextField();
        JPanel jpanelTexfield = new JPanel();

        jpanelTexfield.setLayout(new BoxLayout(jpanelTexfield, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textfield);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(myLabel));

        this.add(borderPanel);

        PlainDocument doc = (PlainDocument) textfield.getDocument();

        doc.setDocumentFilter(new DoubleFilter());
        return textfield;

    }

    public JCheckBox LayoutCheckBox(String myLabel) {
        JPanel jpanelCheckBox = new JPanel();
        JCheckBox CB = new JCheckBox();

        jpanelCheckBox.setLayout(new BoxLayout(jpanelCheckBox, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(CB);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(myLabel));

        jpanelCheckBox.add(borderPanel);
        this.add(jpanelCheckBox);
        return CB;

    }

    public void Buttons() {
        JPanel jpanelButtons = new JPanel();
        ButtonAbrechen.setName("ButtonAbrechenAbbrechen");
        jpanelButtons.setLayout(new GridLayout(1, 0));
        jpanelButtons.add(ButtonBestätigen);
        jpanelButtons.add(ButtonAbrechen);
        this.add(jpanelButtons);

    }

}
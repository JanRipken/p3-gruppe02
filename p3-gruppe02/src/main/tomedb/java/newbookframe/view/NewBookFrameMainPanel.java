package main.tomedb.java.newbookframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import main.tomedb.java.newbookframe.controller.filter.DoubleFilter;
import main.tomedb.java.newbookframe.controller.filter.IntFilter;

public class NewBookFrameMainPanel extends JPanel {

    JButton ButtonBestätigen = new JButton("Bestätigen");
    JButton ButtonAbrechen = new JButton("Abrechen");

    public NewBookFrameMainPanel() {

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

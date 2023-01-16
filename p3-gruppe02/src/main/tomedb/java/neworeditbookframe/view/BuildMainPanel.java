package main.tomedb.java.neworeditbookframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import main.tomedb.java.neworeditbookframe.controller.filter.DoubleFilter;
import main.tomedb.java.neworeditbookframe.controller.filter.IntFilter;

class BuildMainPanel extends JPanel {

    JButton buttonConfirmation = new JButton("Bestätigen");
    JButton buttonCancel = new JButton("Abrechen");

    BuildMainPanel() {

        this.setLayout(new GridLayout(8, 0));

    }

    /**
     * Initialisiern eines Textfieldes ohne filter
     * 
     * @param textfieldTitle
     * @return JTextField
     */
    protected JTextField returnLayoutTextfieldString(String textfieldTitle) {
        JTextField textField = new JTextField();
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textField);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(textfieldTitle));

        this.add(borderPanel);
        return textField;

    }

    /**
     * Initialisiern eines Textfieldes mit Int Filter
     * 
     * @param textfieldTitle
     * @return JTextField
     */
    protected JTextField returnLayoutTextfieldInt(String textfieldTitle) {
        JTextField textField = new JTextField();
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textField);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(textfieldTitle));

        this.add(borderPanel);

        PlainDocument doc = (PlainDocument) textField.getDocument();
        doc.setDocumentFilter(new IntFilter());

        return textField;

    }

    /**
     * Initialisiern eines Textfieldes mit Double Filter
     * 
     * @param textfieldTitle
     * @return JTextField
     */
    protected JTextField returnLayoutTextfieldDouble(String textfieldTitle) {
        JTextField textField = new JTextField();
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(textField);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(textfieldTitle));

        this.add(borderPanel);

        PlainDocument doc = (PlainDocument) textField.getDocument();
        doc.setDocumentFilter(new DoubleFilter());

        return textField;
    }

    /**
     * Initialisieren eine Checkbox
     * 
     * @param checkBoxTitle
     * @return JCheckBox
     */
    protected JCheckBox returnLayoutCheckBox(String checkBoxTitle) {
        JPanel jPanel = new JPanel();
        JCheckBox checkBox = new JCheckBox();

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(checkBox);
        borderPanel.setBorder(new javax.swing.border.TitledBorder(checkBoxTitle));

        jPanel.add(borderPanel);
        this.add(jPanel);

        return checkBox;
    }

    protected void buildButtons() {
        JPanel jpanelButtons = new JPanel();
        jpanelButtons.setLayout(new GridLayout(1, 0));
        jpanelButtons.add(buttonConfirmation);
        jpanelButtons.add(buttonCancel);
        this.add(jpanelButtons);
    }

}

package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.tomedb.java.mainframe.controller.settings.CancelAction;
import main.tomedb.java.mainframe.controller.settings.SaveThemeAction;
import main.tomedb.java.mainframe.controller.menubar.ThemeChangeAction;

public class SettingsPanel extends JPanel {

    private JLabel themeSelectionLabel;
    private JComboBox<String> themeSelectionComboBox;

    private JButton confirmSelectionButton;
    private JButton cancelSelectionButton;

    public SettingsPanel() {
        setLayout(new BorderLayout());

        topPanel();
        bottomPanel();
    }

    /**
     * Anzeigen der themenauswahl Combobox
     */
    private void topPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(Box.createHorizontalStrut(10));
        themeSelectionLabel = new JLabel("Thema: ");
        themeSelectionComboBox = new JComboBox<>();
        themeSelectionComboBox.addItem("Dunkel");
        themeSelectionComboBox.addItem("Hell");

        topPanel.add(themeSelectionLabel);
        topPanel.add(themeSelectionComboBox);

        ThemeChangeAction themeChangeAction = new ThemeChangeAction();
        themeSelectionComboBox.addActionListener(themeChangeAction);

        this.add(topPanel, BorderLayout.NORTH);
    }

    /**
     * Anzeigen der Buttons zum Bestätigen oder Abbrechen
     */
    private void bottomPanel() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        confirmSelectionButton = new JButton("Speichern");
        cancelSelectionButton = new JButton("Abbrechen");

        bottomPanel.add(confirmSelectionButton);
        bottomPanel.add(cancelSelectionButton);

        CancelAction cancel = new CancelAction();
        cancelSelectionButton.addActionListener(cancel);

        SaveThemeAction saveThemeAction = new SaveThemeAction(themeSelectionComboBox);
        confirmSelectionButton.addActionListener(saveThemeAction);

        this.add(bottomPanel, BorderLayout.SOUTH);
    }

}

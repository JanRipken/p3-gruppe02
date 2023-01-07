package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.tomedb.java.mainframe.controller.settings.Abort;
import main.tomedb.java.mainframe.controller.settings.Save;
import main.tomedb.java.mainframe.controller.ThemeChange;

public class SettingsPanel extends JPanel {

    private JLabel themeLabel;
    private JComboBox<String> themeComboBox;

    private JButton confirmButton;
    private JButton abortButton;

    public SettingsPanel() {
        setLayout(new BorderLayout());

        topPanel();
        bottomPanel();

    }

    public void topPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(Box.createHorizontalStrut(10));
        themeLabel = new JLabel("Thema:");
        themeComboBox = new JComboBox<>();
        themeComboBox.addItem("Dunkel");
        themeComboBox.addItem("Hell");

        topPanel.add(themeLabel);
        topPanel.add(themeComboBox);

        ThemeChange themchange = new ThemeChange();
        themeComboBox.addActionListener(themchange);

        this.add(topPanel, BorderLayout.NORTH);
    }

    public void bottomPanel() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        confirmButton = new JButton("Speichern");
        abortButton = new JButton("Abbrechen");

        bottomPanel.add(confirmButton);
        bottomPanel.add(abortButton);

        Abort abort = new Abort();
        abortButton.addActionListener(abort);

        Save save = new Save(themeComboBox);
        confirmButton.addActionListener(save);

        this.add(bottomPanel, BorderLayout.SOUTH);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import main.tomedb.java.mainframe.TomeDB;
import main.tomedb.java.mainframe.controller.SettingsAbort;
import main.tomedb.java.mainframe.controller.SettingsSave;
import main.tomedb.java.mainframe.controller.menubar.themeChange;

public class SettingsPanel extends JPanel {

    private JLabel themeLabel;
    private JComboBox<String> themeComboBox;

    private JButton confirmButton;
    private JButton abortButton;

    public SettingsPanel() {
        setLayout(new BorderLayout());
        // Verwenden Sie GridBagLayout für das Layout
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

        themeChange themchange = new themeChange();
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

        SettingsAbort abort = new SettingsAbort();
        abortButton.addActionListener(abort);

        SettingsSave save = new SettingsSave(themeComboBox);
        confirmButton.addActionListener(save);

        this.add(bottomPanel, BorderLayout.SOUTH);
    }

}

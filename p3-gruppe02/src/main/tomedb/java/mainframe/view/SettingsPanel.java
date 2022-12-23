/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

        // Verwenden Sie GridBagLayout für das Layout
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Erstellen Sie die Steuerelemente
        themeLabel = new JLabel("Thema:");
        themeComboBox = new JComboBox<>();
        themeComboBox.addItem("Dunkel");
        themeComboBox.addItem("Hell");
        confirmButton = new JButton("Speichern");
        abortButton = new JButton("Abbrechen");

        // Fügen Sie die Steuerelemente dem Panel hinzu
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(themeLabel, constraints);
        constraints.gridx = 1;
        add(themeComboBox, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        
        constraints.gridx = 0;
        constraints.gridy = GridBagConstraints.RELATIVE; // Nächste freie Zeile
        constraints.anchor = GridBagConstraints.LINE_END; // Linksbündig
        add(confirmButton, constraints);
        constraints.gridx = 1;
        add(abortButton, constraints);
        
        LookAndFeel LookAndFeel = UIManager.getLookAndFeel();
        
        SettingsAbort abort = new SettingsAbort(LookAndFeel);
        abortButton.addActionListener(abort);
        
        SettingsSave save = new SettingsSave();
        confirmButton.addActionListener(save);
        
        themeChange themchange = new themeChange();
        themeComboBox.addActionListener(themchange);
        
    }
    
}

package main.tomedb.java.mainframe.controller.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import main.tomedb.java.mainframe.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class Save implements ActionListener {

    private JComboBox saveThemeComboBox;

    public Save(JComboBox saveThemeComboBox) {
        this.saveThemeComboBox = saveThemeComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String theme = saveThemeComboBox.getSelectedItem().toString();
        ReadWrite readWrite = new ReadWrite();
        try {
            readWrite.write(theme);
        } catch (IOException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.mainFrame.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.mainFrame);
    }
}
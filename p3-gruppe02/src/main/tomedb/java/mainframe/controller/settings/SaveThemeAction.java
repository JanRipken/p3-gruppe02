package main.tomedb.java.mainframe.controller.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import main.tomedb.java.main.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class SaveThemeAction implements ActionListener {

    private JComboBox saveThemeComboBox;

    public SaveThemeAction(JComboBox saveThemeComboBox) {
        this.saveThemeComboBox = saveThemeComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String theme = saveThemeComboBox.getSelectedItem().toString();
        ReadWriteAction readWrite = new ReadWriteAction();
        try {
            readWrite.write(theme);
        } catch (IOException ex) {
            Logger.getLogger(SaveThemeAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.mainFrame.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.mainFrame);
    }
}
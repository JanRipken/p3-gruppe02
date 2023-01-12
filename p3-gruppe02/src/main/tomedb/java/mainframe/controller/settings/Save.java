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

    private JComboBox cbSaveMode;

    public Save(JComboBox cbSaveMode) {
        this.cbSaveMode = cbSaveMode;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mode = cbSaveMode.getSelectedItem().toString();
        ReadWrite set = new ReadWrite();
        try {
            set.write(mode);
        } catch (IOException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.mainFrame.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.mainFrame);
    }

}

package main.tomedb.java.mainframe.controller.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.designtemplate.themes.DarkTheme;
import main.tomedb.java.designtemplate.themes.LightTheme;
import main.tomedb.java.main.TomeDB;

public class ThemeChangeAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JComboBox comboBox = (JComboBox) e.getSource();
        String selectedItem = (String) comboBox.getSelectedItem();

        if (selectedItem == "Hell") {
            try {
                new LightTheme();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ThemeChangeAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (selectedItem == "Dunkel") {
            try {
                new DarkTheme();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ThemeChangeAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        SwingUtilities.updateComponentTreeUI(TomeDB.mainFrame);
    }
}

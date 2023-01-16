package main.tomedb.java.mainframe.controller.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.designtemplate.themes.DarkTheme;
import main.tomedb.java.designtemplate.themes.LightTheme;
import main.tomedb.java.main.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class CancelAction implements ActionListener {

    public void resetLookAndFeel() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ReadWriteAction readWrite = new ReadWriteAction();
        String mode = readWrite.read();
        if (mode.equals("Hell")) {

            new LightTheme();
        }
        if (mode.equals("Dunkel")) {

            new DarkTheme();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            resetLookAndFeel();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CancelAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CancelAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CancelAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CancelAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        TomeDB.mainFrame.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.mainFrame);
    }
}
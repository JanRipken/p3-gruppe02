package main.tomedb.java.mainframe.controller.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.designtemplate.modes.DarkMode;
import main.tomedb.java.designtemplate.modes.LightMode;
import main.tomedb.java.mainframe.TomeDB;
import static main.tomedb.java.mainframe.view.MainFrame.mainPanel;

public class Abort implements ActionListener {

    public Abort() {

    }

    public void resetLookAndFeel() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ReadWrite set = new ReadWrite();
        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightMode();
        }
        if (mode.equals("Dunkel")) {

            new DarkMode();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            resetLookAndFeel();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Abort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Abort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Abort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Abort.class.getName()).log(Level.SEVERE, null, ex);
        }

        TomeDB.main.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(TomeDB.main);
    }

}

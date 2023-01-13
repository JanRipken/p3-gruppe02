package main.tomedb.java.designtemplate.modes;

import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.mainframe.controller.settings.ReadWrite;


public class SetMode {
    
    public SetMode() throws IllegalAccessException, ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
        ReadWrite set = new ReadWrite();

        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightMode();
        }
        if (mode.equals("Dunkel")) {

            new DarkMode();
        } else {

            System.out.println("Failed to load a Mode");

        }
    }
}
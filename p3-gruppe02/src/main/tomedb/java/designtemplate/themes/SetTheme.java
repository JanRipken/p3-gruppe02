package main.tomedb.java.designtemplate.themes;

import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.mainframe.controller.settings.ReadWriteAction;


public class SetTheme {
    
    public SetTheme() throws IllegalAccessException, ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
        ReadWriteAction set = new ReadWriteAction();

        String mode = set.read();
        if (mode.equals("Hell")) {

            new LightTheme();
        }
        if (mode.equals("Dunkel")) {

            new DarkTheme();
        } else {

            System.out.println("Failed to load a Mode");

        }
    }
}
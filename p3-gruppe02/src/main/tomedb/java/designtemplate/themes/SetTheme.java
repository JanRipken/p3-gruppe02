package main.tomedb.java.designtemplate.themes;

import javax.swing.UnsupportedLookAndFeelException;
import main.tomedb.java.mainframe.controller.settings.ReadWriteAction;

public class SetTheme {

        /**
         * Konstruktor um light theme oder dark theme zu Initialisieren
         * 
         * @throws IllegalAccessException
         * @throws ClassNotFoundException
         * @throws InstantiationException
         * @throws UnsupportedLookAndFeelException 
         */
        public SetTheme() throws IllegalAccessException, ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException {
        ReadWriteAction readWriteAction = new ReadWriteAction();

        String mode = readWriteAction.read();
            switch (mode) {
                case "Hell":
                    new LightTheme();
                    break;
                case "Dunkel":
                    new DarkTheme();
                    break;
                default:
                    System.err.println("Failed to load a Theme");
                    break;
            }
    }
}

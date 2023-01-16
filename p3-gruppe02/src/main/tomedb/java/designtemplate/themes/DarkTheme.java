package main.tomedb.java.designtemplate.themes;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.Painter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DarkTheme {

    public DarkTheme() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {

        try {
            //https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/_nimbusDefaults.html#primary
            UIManager.put("control", new Color(128, 128, 128));
            UIManager.put("info", new Color(128, 128, 128));
            UIManager.put("nimbusBase", new Color(18, 30, 49));
            UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
            UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
            UIManager.put("nimbusFocus", new Color(115, 164, 209));
            UIManager.put("nimbusGreen", new Color(176, 179, 50));
            UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
            UIManager.put("nimbusLightBackground", Color.LIGHT_GRAY);
            UIManager.put("nimbusOrange", new Color(191, 98, 4));
            UIManager.put("nimbusRed", new Color(169, 46, 34));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
            UIManager.put("text", Color.BLACK);
            UIManager.put("MenuItem[MouseOver].backgroundPainter", new FillPainter(Color.GRAY.darker()));

        } catch (Exception e) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
    }
}

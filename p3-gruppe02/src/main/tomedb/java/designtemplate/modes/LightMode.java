/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.designtemplate.modes;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.Painter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import main.tomedb.java.mainframe.TomeDB;

/**
 *
 * @author janr
 */
public class LightMode {

    public LightMode() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {

        try {
            System.out.println("ligth");
//            //https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/_nimbusDefaults.html#primary


            UIManager.put("control", new Color(0, 0, 0));
            UIManager.put("info", new Color(0, 0, 0));
            UIManager.put("nimbusBase", new Color(0, 0, 0));
            UIManager.put("nimbusAlertYellow", new Color(0, 0, 0));
            UIManager.put("nimbusDisabledText", new Color(0, 0, 0));
            UIManager.put("nimbusFocus", new Color(0, 0, 0));
            UIManager.put("nimbusGreen", new Color(0, 0, 0));
            UIManager.put("nimbusInfoBlue", new Color(0, 0, 0));
            UIManager.put("nimbusLightBackground", Color.red);
            UIManager.put("nimbusOrange", new Color(0, 0, 0));
            UIManager.put("nimbusRed", new Color(10, 0, 0));
            UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
            UIManager.put("nimbusSelectionBackground", new Color(0, 0, 0));
            UIManager.put("text", Color.red);
            UIManager.put("MenuItem[MouseOver].backgroundPainter", new FillPainter(Color.red.brighter()));
            
        } catch (Exception e) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
    }

    class FillPainter implements Painter<JComponent> {

        private final Color color;

        FillPainter(Color c) {
            color = c;
        }

        @Override
        public void paint(Graphics2D g, JComponent object, int width, int height) {
            g.setColor(color);
            g.fillRect(0, 0, width - 1, height - 1);
        }
    }
}

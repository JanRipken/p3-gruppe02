package main.tomedb.java.designtemplate.themes;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.Painter;

class FillPainter implements Painter<JComponent> {

    private final Color color;

    FillPainter(Color c) {
        color = c;
    }
    
    /**
     * 
     * @param g Graphics2D instanz 
     * @param object JComponent instanz
     * @param width
     * @param height 
     */
    @Override
    public void paint(Graphics2D g, JComponent object, int width, int height) {
        g.setColor(color);
        g.fillRect(0, 0, width - 1, height - 1);
    }
}
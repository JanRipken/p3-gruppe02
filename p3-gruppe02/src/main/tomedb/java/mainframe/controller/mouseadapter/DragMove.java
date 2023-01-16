package main.tomedb.java.mainframe.controller.mouseadapter;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.tomedb.java.mainframe.view.MainFrame;

public class DragMove extends MouseAdapter {

    MainFrame view;

    private Point mouseDownCompCoords = null;

    public DragMove(MainFrame view) {
        this.view = view;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseDownCompCoords = null;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseDownCompCoords = e.getPoint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point currCoords = e.getLocationOnScreen();
        view.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }
}

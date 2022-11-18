package main.java.mainframe.controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.java.mainframe.view.MainFrame;

// Controller zum verschieben des MainFrames mit hilfe von Mouse Drag moves
public class MainFramDragListener extends MouseAdapter {

    MainFrame view;
    private Point mouseDownCompCoords = null;

    public MainFramDragListener(MainFrame view) {
        this.view = view;
    }

    public void mouseReleased(MouseEvent e) {
        mouseDownCompCoords = null;
    }

    public void mousePressed(MouseEvent e) {
        mouseDownCompCoords = e.getPoint();
    }

    public void mouseDragged(MouseEvent e) {
        Point currCoords = e.getLocationOnScreen();
        view.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }
}

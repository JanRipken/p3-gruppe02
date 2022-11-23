package main.tomedb.java.mainframe.controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.tomedb.java.mainframe.view.MainFrame;

//TODO Refactoring
public class MainFramDragMove extends MouseAdapter {

    MainFrame view;

    private Point mouseDownCompCoords = null;

    public MainFramDragMove(MainFrame view) {
        this.view = view;
    }

    // if the mouse is release we are setting our Point back to zero
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseDownCompCoords = null;
    }

    // aslong as the mouse key is pressed we are setting our Point to where ever the
    // mouse is pressed
    @Override
    public void mousePressed(MouseEvent e) {
        mouseDownCompCoords = e.getPoint();
    }

    // if the mouse is dragged we are changing the Location of our view to where we
    // drag the mouse
    @Override
    public void mouseDragged(MouseEvent e) {
        Point currCoords = e.getLocationOnScreen();
        view.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }
}

package main.tomedb.java.editbookframe.controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO wir haben das selbe schon beim MainFrame gemacht reicht das nicht das dort zuverwenden mit einem neuen Konstruktor
public class DragMove extends MouseAdapter {

    private Point mouseDownCompCoords = null;
    main.tomedb.java.newbookframe.view.NewBook view;

    public DragMove(main.tomedb.java.newbookframe.view.NewBook view) {
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

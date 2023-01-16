package main.tomedb.java.neworeditbookframe.controller.mouseadapter;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DragMove extends MouseAdapter {

    private Point mouseDownCompCoords = null;
    main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame view;

    public DragMove(main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame view) {
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

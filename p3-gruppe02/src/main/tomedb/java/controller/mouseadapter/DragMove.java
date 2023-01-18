package main.tomedb.java.controller.mouseadapter;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;

public class DragMove extends MouseAdapter {

    private MainFrame view;
    private NewOrEditBookFrame view2;

    private Point mouseDownCompCoords = null;

    public DragMove(MainFrame view) {
        this.view = view;
    }

    public DragMove(NewOrEditBookFrame view) {
        this.view2 = view;
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
        if (view != null) {
            view.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
        if (view2 != null) {
            view2.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }

    }
}

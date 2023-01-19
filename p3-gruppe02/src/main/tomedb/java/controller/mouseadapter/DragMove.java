package main.tomedb.java.controller.mouseadapter;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;

public class DragMove extends MouseAdapter {

    private MainFrame mainFrame;
    private NewOrEditBookFrame newOrEditBookFrame;

    private Point mouseDownCompCoords = null;
    
    public DragMove(MainFrame mainFrame, NewOrEditBookFrame newOrEditBookFrame) {
        this.mainFrame = mainFrame;
        this.newOrEditBookFrame = newOrEditBookFrame;
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
        if (mainFrame != null) {
            mainFrame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
        if (newOrEditBookFrame != null) {
            newOrEditBookFrame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }

    }
}

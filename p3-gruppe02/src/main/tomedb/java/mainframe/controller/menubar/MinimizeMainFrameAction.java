package main.tomedb.java.mainframe.controller.menubar;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.tomedb.java.main.TomeDB;

public class MinimizeMainFrameAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        TomeDB.mainFrame.setState(Frame.ICONIFIED);
    }
    
}

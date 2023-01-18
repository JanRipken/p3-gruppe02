package main.tomedb.java.mainframe.controller.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewBookAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        new main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame();

    }
}

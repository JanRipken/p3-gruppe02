package main.tomedb.java.neworeditbookframe.controller;

import main.tomedb.java.neworeditbookframe.view.NewOrEditBookFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelAction implements ActionListener {

    private NewOrEditBookFrame view;

    public CancelAction(NewOrEditBookFrame view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
    }

}

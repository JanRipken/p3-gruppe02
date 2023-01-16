package main.tomedb.java.neworeditbookframe.controller;

import main.tomedb.java.neworeditbookframe.view.NewBookOrEditBookFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelAction implements ActionListener {

    private NewBookOrEditBookFrame view;

    public CancelAction(NewBookOrEditBookFrame view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
    }

}

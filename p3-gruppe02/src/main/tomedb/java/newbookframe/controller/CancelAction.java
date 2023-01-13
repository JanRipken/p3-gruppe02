package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewBookOrEditBookFrame;
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

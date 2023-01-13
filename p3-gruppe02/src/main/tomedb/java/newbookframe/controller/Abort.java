package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewOrEditFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abort implements ActionListener {

    private NewOrEditFrame view;

    public Abort(NewOrEditFrame view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
        ;
    }

}

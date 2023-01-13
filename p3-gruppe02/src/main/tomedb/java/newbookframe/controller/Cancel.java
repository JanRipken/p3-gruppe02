package main.tomedb.java.newbookframe.controller;

import main.tomedb.java.newbookframe.view.NewOrEditFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cancel implements ActionListener {

    private NewOrEditFrame view;

    public Cancel(NewOrEditFrame view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
    }

}

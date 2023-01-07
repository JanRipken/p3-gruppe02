package main.tomedb.java.editbookframe.controller;

import main.tomedb.java.editbookframe.view.EditBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abort implements ActionListener {

    private EditBook view;

    public Abort(EditBook view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();

    }

}

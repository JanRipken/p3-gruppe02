/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import main.tomedb.java.newbookframe.controller.NewBook;
import main.tomedb.java.mainframe.controller.JTableSearch;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class NorthPanel extends JPanel {

    private JButton newBookButton;
    private JButton searchBookButton;

    private ImageIcon iconNeu;
    private ImageIcon iconSuchen;

    public NorthPanel() {

        this.setLayout(new GridLayout());
        this.setSize(WIDTH, 10);

        newBookButton = new JButton();
        iconNeu = new ImageIcon(this.getClass().getResource("/main/tomedb/ressources/icons/new.gif"));
        newBookButton.setIcon(iconNeu);

        searchBookButton = new JButton();
        iconSuchen = new ImageIcon(this.getClass().getResource("/main/tomedb/ressources/icons/suchen.gif"));
        searchBookButton.setIcon(iconSuchen);

        NewBook startNewWindow = new NewBook();
        newBookButton.addActionListener(startNewWindow);

        JTableSearch DurchsucheListe = new JTableSearch();
        searchBookButton.addActionListener(DurchsucheListe);

        this.add(newBookButton);
        this.add(searchBookButton);

    }
}

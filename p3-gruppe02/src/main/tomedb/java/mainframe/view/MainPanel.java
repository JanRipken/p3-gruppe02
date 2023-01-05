/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.tomedb.java.mainframe.controller.JTableChanged;
import main.tomedb.java.mainframe.controller.JTableSearch;
import main.tomedb.java.newbookframe.controller.NewBook;

/**
 *
 * @author janri
 */
public class MainPanel extends JPanel {

    public MainPanel() {
        this.setLayout(new BorderLayout());
        NorthPanel();
        SouthPanel();
    }

    private JButton newBookButton;
    private JButton searchBookButton;

    private ImageIcon iconNeu;
    private ImageIcon iconSuchen;
    public static Table JlistTabelle;
    public static JTableChanged TableListener;

    public void NorthPanel() {
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout());
        northPanel.setSize(WIDTH, 10);

        newBookButton = new JButton();
        iconNeu = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/new.gif", 25, 25);
        newBookButton.setIcon(iconNeu);

        searchBookButton = new JButton();
        iconSuchen = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/suchen.gif", 25, 25);
        searchBookButton.setIcon(iconSuchen);

        NewBook startNewWindow = new NewBook();
        newBookButton.addActionListener(startNewWindow);

        JTableSearch DurchsucheListe = new JTableSearch();
        searchBookButton.addActionListener(DurchsucheListe);

        northPanel.add(newBookButton);
        northPanel.add(searchBookButton);

        this.add(northPanel,BorderLayout.NORTH);

    }

    
    

    public void SouthPanel() {
        JPanel southPanel = new JPanel();
        JlistTabelle = new Table();

        TableListener = new JTableChanged();
        // zugriff vom controller
        southPanel.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(JlistTabelle.table);
        sp.setBorder(null);
        southPanel.add(sp);
        this.add(southPanel, BorderLayout.CENTER);

    }
}

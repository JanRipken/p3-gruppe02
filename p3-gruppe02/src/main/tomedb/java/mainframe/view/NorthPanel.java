package main.tomedb.java.mainframe.view;

import main.tomedb.java.newbookframe.controller.NewBook;
import main.tomedb.java.mainframe.controller.JTableSearch;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NorthPanel extends JPanel {

    private JButton newBookButton;
    private JButton searchBookButton;

    private ImageIcon iconNeu;
    private ImageIcon iconSuchen;

    public NorthPanel() {

        this.setLayout(new GridLayout());
        this.setSize(WIDTH, 10);

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

        this.add(newBookButton);
        this.add(searchBookButton);

    }
}

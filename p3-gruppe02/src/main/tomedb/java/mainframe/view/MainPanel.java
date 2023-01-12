package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.tomedb.java.mainframe.controller.jtable.Changed;
import main.tomedb.java.mainframe.controller.jtable.Search;
import main.tomedb.java.newbookframe.controller.NewBook;

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
    public static Table jListTable;
    public static Changed TableListener;

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

        Search DurchsucheListe = new Search();
        searchBookButton.addActionListener(DurchsucheListe);

        northPanel.add(newBookButton);
        northPanel.add(searchBookButton);

        this.add(northPanel, BorderLayout.NORTH);

    }

    public void SouthPanel() {
        JPanel southPanel = new JPanel();
        jListTable = new Table();

        TableListener = new Changed();

        southPanel.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(jListTable.table);
        sp.setBorder(null);
        southPanel.add(sp);
        this.add(southPanel, BorderLayout.CENTER);

    }
}

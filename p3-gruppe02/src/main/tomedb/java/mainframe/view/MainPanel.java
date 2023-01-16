package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.tomedb.java.mainframe.controller.jtable.ChangeTableStateListener;
import main.tomedb.java.mainframe.controller.jtable.SearchAction;
import main.tomedb.java.mainframe.controller.jtable.NewBookAction;

public class MainPanel extends JPanel {

    public MainPanel() {
        this.setLayout(new BorderLayout());
        northPanel();
        southPanel();
    }

    private JButton newBookButton;
    private JButton searchBookButton;

    private ImageIcon newBookIcon;
    private ImageIcon searchBookIcon;
    public static Table table;
    public static ChangeTableStateListener tableListener;

    /**
     * Erstellen der Button für Suche und zum erstellen eines neuen Buch Objektes
     */
    public void northPanel() {
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout());
        northPanel.setSize(WIDTH, 10);

        newBookButton = new JButton();
        newBookIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/new.gif", 25, 25);
        newBookButton.setIcon(newBookIcon);

        searchBookButton = new JButton();
        searchBookIcon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/suchen.gif", 25, 25);
        searchBookButton.setIcon(searchBookIcon);

        NewBookAction newBookAction = new NewBookAction();
        newBookButton.addActionListener(newBookAction);

        SearchAction searchAction = new SearchAction();
        searchBookButton.addActionListener(searchAction);

        northPanel.add(newBookButton);
        northPanel.add(searchBookButton);

        this.add(northPanel, BorderLayout.NORTH);
    }

     /**
     * Erstellen einer Tabelle
     */
    public void southPanel() {
        JPanel southPanel = new JPanel();
        table = new Table();
        tableListener = new ChangeTableStateListener();
        
        southPanel.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(table.jTable);
        scrollPane.setBorder(null);
        southPanel.add(scrollPane);
        
        this.add(southPanel, BorderLayout.CENTER);
    }
}

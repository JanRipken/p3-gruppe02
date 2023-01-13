package main.tomedb.java.mainframe.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.tomedb.java.mainframe.controller.jtable.TableModified;
import main.tomedb.java.mainframe.controller.jtable.SelectiveSearchAction;
import main.tomedb.java.newbookframe.controller.NewBookAction;

public class MainPanel extends JPanel {

    public MainPanel() {
        this.setLayout(new BorderLayout());
        NorthPanel();
        SouthPanel();
    }

    private JButton newBookButton;
    private JButton searchBookButton;

    private ImageIcon newBookIcon;
    private ImageIcon searchBookIcon;
    public static Table table;
    public static TableModified tableListener;

    public void NorthPanel() {
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

        SelectiveSearchAction searchAction = new SelectiveSearchAction();
        searchBookButton.addActionListener(searchAction);

        northPanel.add(newBookButton);
        northPanel.add(searchBookButton);

        this.add(northPanel, BorderLayout.NORTH);
    }

    public void SouthPanel() {
        JPanel southPanel = new JPanel();
        table = new Table();
        tableListener = new TableModified();
        
        southPanel.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(table.jTable);
        scrollPane.setBorder(null);
        southPanel.add(scrollPane);
        
        this.add(southPanel, BorderLayout.CENTER);
    }
}

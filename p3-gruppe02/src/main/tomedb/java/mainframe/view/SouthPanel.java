package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.controller.JTableListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author janri
 */
public class SouthPanel extends JPanel {

    public static SouthPanelJTable JlistTabelle;
    public static JTableListener TableListener;

    public SouthPanel() {

        JlistTabelle = new SouthPanelJTable();
        
        TableListener = new JTableListener();
        // zugriff vom controller
        this.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(JlistTabelle.table);
        sp.setBorder(null);
        this.add(sp);

    }

}

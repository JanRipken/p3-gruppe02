package main.tomedb.java.mainframe.view;

import main.tomedb.java.mainframe.controller.JTableChanged;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author janri
 */
public class SouthPanel extends JPanel {

    public static Table JlistTabelle;
    public static JTableChanged TableListener;

    public SouthPanel() {

        JlistTabelle = new Table();

        TableListener = new JTableChanged();
        // zugriff vom controller
        this.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(JlistTabelle.table);
        sp.setBorder(null);
        this.add(sp);

    }

}

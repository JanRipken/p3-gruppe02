package view.MainFrames;

import controller.MainFrame.JTableListener;
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
        this.add(sp);

    }

}

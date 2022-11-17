
package view.MainFrames;

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

    public SouthPanel() {

        JlistTabelle = new SouthPanelJTable();
        
        this.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(JlistTabelle.table);
        this.add(sp);
        
        
        

    }

}

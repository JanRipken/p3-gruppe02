/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class SouthPanel extends JPanel {

    public static SouthPanelJList JlistTabelle;

    public SouthPanel() {

        JlistTabelle = new SouthPanelJList();
        this.add(JlistTabelle);
        
    }

}

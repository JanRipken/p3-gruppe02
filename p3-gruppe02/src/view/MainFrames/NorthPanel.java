/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import controller.AddNewBookControll.AddNewBookMainController;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author janri
 */
public class NorthPanel extends JPanel{
    public JButton newBookButton = new JButton("Neu");
        JLabel label = new JLabel();

        public NorthPanel() {

            //Create Controller
            AddNewBookMainController startNewWindow = new AddNewBookMainController(this);
            newBookButton.addActionListener(startNewWindow);

            // label
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);

            // Zum frame hinzufügen
            this.add(newBookButton);
            this.add(label);

            this.setLayout(new GridLayout());

        }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;

import controller.AddNewBookControll.AddNewBookMainController;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author janri
 */
public class NorthPanel extends JPanel{
    
    private JButton newBookButton;
    private JLabel label;
    private ImageIcon icon ;
            
        public NorthPanel() {
            
            newBookButton = new JButton();
            label = new JLabel();
            this.setSize(WIDTH, 10);
          
            // Button icon
            icon = new ImageIcon(this.getClass().getResource("/assets/icons/new.gif"));
            newBookButton.setIcon(icon);
            
            
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

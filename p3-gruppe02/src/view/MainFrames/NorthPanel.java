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
    private JButton searchBookButton;
   
    private ImageIcon iconNeu;
    private ImageIcon iconSuchen ;
            
        public NorthPanel() {
            
            this.setLayout(new GridLayout());
             this.setSize(WIDTH, 10);
            
           
         
            
            
           
          
            // Neues Buch 
            newBookButton = new JButton(); 
            iconNeu = new ImageIcon(this.getClass().getResource("/assets/icons/new.gif"));
            newBookButton.setIcon(iconNeu);
            
            //Buch suchen
            searchBookButton=new JButton();
            iconSuchen = new ImageIcon(this.getClass().getResource("/assets/icons/suchen.gif"));
            searchBookButton.setIcon(iconSuchen);
            
            
            //Create Controller
            AddNewBookMainController startNewWindow = new AddNewBookMainController(this);
            newBookButton.addActionListener(startNewWindow);


            // Zum frame hinzufügen
            this.add(newBookButton);
            this.add(searchBookButton);

            

        }   
}

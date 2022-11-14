/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.AddNewBookFrames;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author janri
 */
public class LayoutAddBookCheckbox extends JPanel{
    
     JLabel label = new JLabel();
     JCheckBox CB = new JCheckBox();
        
        public  LayoutAddBookCheckbox(String myLabel){
            this.setLayout(new GridLayout(0,1));
              label.setText(myLabel);
               
               this.add(label);
               this.add(CB);
               
        }
}

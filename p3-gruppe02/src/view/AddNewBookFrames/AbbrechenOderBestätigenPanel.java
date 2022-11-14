/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.AddNewBookFrames;

import controller.AddNewBookControll.AddNewBookMainController;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class AbbrechenOderBestätigenPanel extends JPanel{
    JButton ButtonBestätigen = new JButton("Bestätigen");
        JButton ButtonAbrechen = new JButton("Abrechen");
        
        public AbbrechenOderBestätigenPanel(){
            
            ButtonAbrechen.setName("ButtonAbrechenAbbrechen");
            this.setLayout(new GridLayout(1,0));
            this.add(ButtonBestätigen);
            this.add(ButtonAbrechen);
              
        }    
}

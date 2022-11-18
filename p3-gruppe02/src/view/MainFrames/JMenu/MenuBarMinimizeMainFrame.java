/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author janri
 */
public class MenuBarMinimizeMainFrame {
    ImageIcon minimizeIcon;
    JButton minimizeButton;
    public MenuBarMinimizeMainFrame(){
        minimizeIcon = new ImageIcon(this.getClass().getResource("/assets/icons/minimize-sign.png"));
        Image image = minimizeIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
        minimizeIcon = new ImageIcon(newimg);
        minimizeIcon.getImage();

        
        minimizeButton = new JButton();

        minimizeButton.setIcon(minimizeIcon);
       
        minimizeButton.setPreferredSize(new Dimension(20,20));
    }
    
    public JButton makeMinimize() {

        return minimizeButton;
    }
    
}

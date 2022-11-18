/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames.JMenu;

import controller.MainFrame.CloseMainFrame;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;

/**
 *
 * @author janri
 */
public class MenuBarCloseMainFrame extends JMenu {

    ImageIcon CloseIcon;
    JButton closeButton;

    public MenuBarCloseMainFrame() {
        
        CloseIcon = new ImageIcon(this.getClass().getResource("/assets/icons/close.png"));
        Image image = CloseIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(10, 10,  java.awt.Image.SCALE_SMOOTH);
        CloseIcon = new ImageIcon(newimg);
        CloseIcon.getImage();

        
        closeButton = new JButton();

        closeButton.setIcon(CloseIcon);
       
        closeButton.setPreferredSize(new Dimension(20,20));
        
        CloseMainFrame close = new CloseMainFrame();
        closeButton.addActionListener(close);
        
        
    }

    public JButton makeClose() {

        return closeButton;
    }
}

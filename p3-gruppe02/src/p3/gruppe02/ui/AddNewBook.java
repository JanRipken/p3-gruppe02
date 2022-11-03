
package p3.gruppe02.ui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddNewBook {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("HI");
    AddNewBook(){
        
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        
        frame.add(label);
        
       
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

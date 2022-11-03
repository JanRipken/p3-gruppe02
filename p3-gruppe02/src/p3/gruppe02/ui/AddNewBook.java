
package p3.gruppe02.ui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddNewBook {
    
    JFrame addNewBookFrame = new JFrame();
    JLabel testLabel = new JLabel("HI");
    AddNewBook(){
        
        testLabel.setBounds(0,0,100,50);
        testLabel.setFont(new Font(null,Font.PLAIN,25));
        
        addNewBookFrame.add(testLabel);
        
       
        addNewBookFrame.setSize(420, 420);
        addNewBookFrame.setLayout(null);
        addNewBookFrame.setVisible(true);
    }
}

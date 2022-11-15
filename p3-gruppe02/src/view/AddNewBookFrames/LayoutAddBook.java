
package view.AddNewBookFrames;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LayoutAddBook extends JPanel {
    JLabel label = new JLabel();
    JTextField textfield = new JTextField();
        
        public LayoutAddBook(String myLabel){
                this.setLayout(new GridLayout(0,1));
            
                label.setText(myLabel);
              
                this.add(label);
                this.add(textfield);

        }    
}

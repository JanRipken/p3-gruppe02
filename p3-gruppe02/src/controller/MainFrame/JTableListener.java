

package controller.MainFrame;

import controller.WindowController.WindowEventHandler;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;




public class JTableListener implements TableModelListener {

    public JTableListener(){
    
    }
    

    @Override
    public void tableChanged(TableModelEvent e) {
        CloseMainFrame.changedTable = true;
    }
    
}

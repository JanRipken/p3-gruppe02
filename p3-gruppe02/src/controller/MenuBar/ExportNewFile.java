package controller.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainFrames.JMenu.FileMenuBarMenu;

/**
 *
 * @author alex-
 */

    public class ExportNewFile implements ActionListener {

    public ExportNewFile(FileMenuBarMenu aThis) {
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Die CSV File wurde importiert");
            System.out.println(e.getActionCommand());
        }
    }

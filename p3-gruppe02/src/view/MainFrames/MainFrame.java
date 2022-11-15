/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.MainFrames;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import view.MainFrames.JMenu.MainFrameFileMenuBar;
import view.WindowEventHandler;

/**
 *
 * @author matthiaskoziol
 */
public class MainFrame extends JFrame {
/*
    public class FileMenuBar extends JMenuBar {

        public FileMenuBar() {
            super();
            this.add(new FileMenu());
        }
    }

    public class FileMenu extends JMenu {

        FileMenu() {
            super("File");
            this.add(new FileOpenItem());
            this.add(new ExportCSV());
        }
    }

    public class FileOpenItem extends JMenuItem {

        FileOpenItem() {
            super("Import as CSV File");
            this.addActionListener(new ImportCSVListener());
        }
    }

    public class ExportCSV extends JMenuItem {

        ExportCSV() {
            super("Export as CSV File");
            this.addActionListener(new ExportCSVListener());
        }
    }

    public class ImportCSVListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Die CSV File wurde importiert");
            System.out.println(e.getActionCommand());
        }
    }

    public class ExportCSVListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Die CSV File wurde exportiert");
            System.out.println(e.getActionCommand());
        }
    }

    
*/
    

    public MainFrame() {

        // TODO: überarbeiten 
        addWindowListener(new WindowEventHandler());
        LayoutManager lm = new BorderLayout();
        this.setLayout(lm);
        
        //setJMenuBar(new FileMenuBar());
        
        // erstellen der Klasse FileMenuBar und aufrufen der Methode zum einfügen der Menu bar
        MainFrameFileMenuBar menuBar = new MainFrameFileMenuBar();
        this.setJMenuBar(menuBar.makeMenuBar());
        
        
        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(), BorderLayout.CENTER);

        this.setTitle("p3-gruppe02");
        this.setSize(900, 600);

        this.setResizable(true);
        this.setVisible(true);

        // Startup des Fensters in der Mitte des Desktops
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

}

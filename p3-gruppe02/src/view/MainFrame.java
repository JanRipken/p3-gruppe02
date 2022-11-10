/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.BookModel;
import controller.AddNewBookButtonController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author matthiaskoziol
 */
public class MainFrame extends JFrame {

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

    public class NorthPanel extends JPanel {

        public JButton newBookButton = new JButton("Neu");
        JLabel label = new JLabel();

        private NorthPanel() {

            ImageIcon IconBook = new ImageIcon("buch.jpg");
            Image BookImage = IconBook.getImage();
            Image modifiedBookImage = BookImage.getScaledInstance(100, 60, Image.SCALE_SMOOTH);
            ImageIcon newBookIcon = new ImageIcon(modifiedBookImage);

            newBookButton.addActionListener(new AddNewBookButtonController(this));

            label.setIcon(newBookIcon);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);

            this.add(newBookButton);
            this.add(label);

            this.setLayout(new GridLayout());

        }
    }

    private class SouthPanel extends JPanel {

        public SouthPanel() {

            this.setLayout(new GridLayout());

            //test - 2 bücher erstellt um diese auslesen zu lassen
            BookModel buch1 = new BookModel("BuchEins");
            BookModel buch2 = new BookModel("BuchDos");

            //Erstellen der Tabelle
            //Spalteninhalt
            //test - Titel werden ausgelesen
            String[][] data = {
                {buch1.getTitel(),"Mustermann", "Max", "123", "true", "1.2", "1990"},
                {buch2.getTitel(), "Musterfrau", "Maxine", "456", "false", "6.7", "2021"}
            };
            // Spaltennamen
            String[] columnNames = {"Titel", "AutorName", "AutorVorname", "Seitenanzahl", "Gelesen", "Bewertung", "Erscheinungsjahr"};
            // Initiallisierung
            JTable tabelle = new JTable(data, columnNames);
            // in eine ScrollPane einsetzen, macht die tabelle scrollbar
            JScrollPane sp = new JScrollPane(tabelle);
            this.add(sp);
        }

    }

    public MainFrame() {

        addWindowListener(new WindowEventHandler());
        LayoutManager lm = new BorderLayout();
        this.setLayout(lm);

        setJMenuBar(new FileMenuBar());

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

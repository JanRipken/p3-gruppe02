/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AddNewBookButtonController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author matthiaskoziol
 */
public class MainFrame extends JFrame {

    public class NorthPanel extends JPanel {

        JButton newBookButton = new JButton("Neu");
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
            
            //Erstellen der Tabelle
            //Spalteninhalt, statisch
            String[][] data = {
                {"Buch1", "Mustermann", "Max", "123", "true", "1.2", "1990"},
                {"Buch2", "Musterfrau", "Maxine", "456", "false", "6.7", "2021"}
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

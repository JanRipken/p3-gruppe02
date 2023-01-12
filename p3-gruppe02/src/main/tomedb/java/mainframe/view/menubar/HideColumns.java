package main.tomedb.java.mainframe.view.menubar;


import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JTable;
import main.tomedb.java.mainframe.controller.menubar.showhide.ColumnShowHide;

public class HideColumns extends JMenu {

    private JMenu hideColumnsMenu;
    public static JCheckBox titleCheckBox;
    public static JCheckBox authorLastNameCheckBox;
    public static JCheckBox authorFirstNameCheckBox;
    public static JCheckBox yearOfReleaseCheckBox;
    public static JCheckBox ratingCheckBox;
    public static JCheckBox readStatusCheckBox;
    public static JCheckBox pageCountCheckBox;
    private JTable table;

    public HideColumns() throws ClassNotFoundException {

        hideColumnsMenu = new JMenu("Ausblenden");
        titleCheckBox = new JCheckBox("Buch Titel");
        authorLastNameCheckBox = new JCheckBox("Autor");
        authorFirstNameCheckBox = new JCheckBox("Vorname");
        yearOfReleaseCheckBox = new JCheckBox("Erscheinungsjahr");
        pageCountCheckBox = new JCheckBox("Seitenanzahl");
        ratingCheckBox = new JCheckBox("Bewertung");
        readStatusCheckBox = new JCheckBox("Nochmal lesen");

        hideColumnsMenu.add(titleCheckBox);
        hideColumnsMenu.add(authorLastNameCheckBox);
        hideColumnsMenu.add(authorFirstNameCheckBox);
        hideColumnsMenu.add(yearOfReleaseCheckBox);
        hideColumnsMenu.add(pageCountCheckBox);
        hideColumnsMenu.add(ratingCheckBox);
        hideColumnsMenu.add(readStatusCheckBox);

        ColumnShowHide toggleTitle = new ColumnShowHide(titleCheckBox);
        titleCheckBox.addActionListener(toggleTitle);
        
        ColumnShowHide toggleLastName = new ColumnShowHide(authorLastNameCheckBox);
        authorLastNameCheckBox.addActionListener(toggleLastName);
        
        ColumnShowHide toggleFirstName = new ColumnShowHide(authorFirstNameCheckBox);
        authorFirstNameCheckBox.addActionListener(toggleFirstName);

        ColumnShowHide toggleYearOfRelease = new ColumnShowHide(yearOfReleaseCheckBox);
        yearOfReleaseCheckBox.addActionListener(toggleYearOfRelease);

        ColumnShowHide togglePageCount = new ColumnShowHide(pageCountCheckBox);
        pageCountCheckBox.addActionListener(togglePageCount);

        ColumnShowHide toggleRating = new ColumnShowHide(ratingCheckBox);
        ratingCheckBox.addActionListener(toggleRating);

        ColumnShowHide toggleReadAgain = new ColumnShowHide(readStatusCheckBox);
        readStatusCheckBox.addActionListener(toggleReadAgain);
    }

    public JMenu returnHideColumnsJMenu() {

        return hideColumnsMenu;
    }
}

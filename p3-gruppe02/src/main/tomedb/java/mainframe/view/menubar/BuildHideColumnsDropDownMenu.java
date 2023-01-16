package main.tomedb.java.mainframe.view.menubar;


import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JTable;
import main.tomedb.java.mainframe.controller.menubar.dropdownmenus.ColumnShowHideAction;

public class BuildHideColumnsDropDownMenu {

    private JMenu hideColumnsMenu;
    public static JCheckBox titleCheckBox;
    public static JCheckBox authorLastNameCheckBox;
    public static JCheckBox authorFirstNameCheckBox;
    public static JCheckBox yearOfReleaseCheckBox;
    public static JCheckBox ratingCheckBox;
    public static JCheckBox readStatusCheckBox;
    public static JCheckBox pageCountCheckBox;
    private JTable table;

    public BuildHideColumnsDropDownMenu() throws ClassNotFoundException {

        hideColumnsMenu = new JMenu("Ausblenden");
        titleCheckBox = new JCheckBox("Titel");
        authorLastNameCheckBox = new JCheckBox("Name");
        authorFirstNameCheckBox = new JCheckBox("Vorname");
        yearOfReleaseCheckBox = new JCheckBox("Erscheinungsjahr");
        pageCountCheckBox = new JCheckBox("Seitenanzahl");
        ratingCheckBox = new JCheckBox("Bewertung");
        readStatusCheckBox = new JCheckBox("Gelesen");

        hideColumnsMenu.add(titleCheckBox);
        hideColumnsMenu.add(authorLastNameCheckBox);
        hideColumnsMenu.add(authorFirstNameCheckBox);
        hideColumnsMenu.add(yearOfReleaseCheckBox);
        hideColumnsMenu.add(pageCountCheckBox);
        hideColumnsMenu.add(ratingCheckBox);
        hideColumnsMenu.add(readStatusCheckBox);

        ColumnShowHideAction toggleTitle = new ColumnShowHideAction(titleCheckBox);
        titleCheckBox.addActionListener(toggleTitle);
        
        ColumnShowHideAction toggleLastName = new ColumnShowHideAction(authorLastNameCheckBox);
        authorLastNameCheckBox.addActionListener(toggleLastName);
        
        ColumnShowHideAction toggleFirstName = new ColumnShowHideAction(authorFirstNameCheckBox);
        authorFirstNameCheckBox.addActionListener(toggleFirstName);

        ColumnShowHideAction toggleYearOfRelease = new ColumnShowHideAction(yearOfReleaseCheckBox);
        yearOfReleaseCheckBox.addActionListener(toggleYearOfRelease);

        ColumnShowHideAction togglePageCount = new ColumnShowHideAction(pageCountCheckBox);
        pageCountCheckBox.addActionListener(togglePageCount);

        ColumnShowHideAction toggleRating = new ColumnShowHideAction(ratingCheckBox);
        ratingCheckBox.addActionListener(toggleRating);

        ColumnShowHideAction toggleReadAgain = new ColumnShowHideAction(readStatusCheckBox);
        readStatusCheckBox.addActionListener(toggleReadAgain);
    }

    public JMenu returnHideColumnsJMenu() {
        return hideColumnsMenu;
    }
}

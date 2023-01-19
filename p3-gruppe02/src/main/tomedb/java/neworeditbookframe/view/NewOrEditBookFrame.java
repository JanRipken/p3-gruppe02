package main.tomedb.java.neworeditbookframe.view;

import main.tomedb.java.neworeditbookframe.controller.CancelAction;
import main.tomedb.java.neworeditbookframe.controller.SaveAction;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import main.tomedb.java.mainframe.view.MainFrame;
import main.tomedb.java.controller.mouseadapter.DragMove;
import main.tomedb.java.main.model.BookModel;

public class NewOrEditBookFrame extends JFrame {

    private final String questionsBookTitle = "Buchtitel";
    private final String questionLastName = "Name des Autors";
    private final String questionFirstName = "Vorname des Autors";
    private final String questionYearOfRelease = "Erscheinungsjahr";
    private final String questionPageCount = "Seitenanzahl";
    private final String questionRating = "Bewertung";
    private final String questionReadStatus = "Bereits Gelesen?";

    private final String toolTipYearOfRelease = "Geben sie das Erscheinungjahr als Zahl ein ";
    private final String toolTipPageCount = "Geben sie die Seitenzahl als Zahl ein ";
    private final String toolTipRating = "Geben sie ihre Bewertung als Zahl ein ";

    public static JTextField title;
    public static JTextField lastName;
    public static JTextField firstName;
    public static JTextField yearOfRelease;
    public static JTextField pageCount;
    public static JTextField rating;
    public static JCheckBox readStatus;

    private final int width = 350;
    private final int height = 600;

    /**
     * Erstellen und Designen eines Frames zum hinzufügen oder Editieren eines
     * neuen Objektes
     */
    public NewOrEditBookFrame(BookModel book) {

        this.setUndecorated(true);

        ImageIcon icon = MainFrame.modIcons.scaling("/main/tomedb/ressources/icons/bookAdd.png", 30, 30);
        this.setIconImage(icon.getImage());

        BuildMainPanel buildMainPanel = new BuildMainPanel();

        DragMove dragMove = new DragMove(this);
        this.addMouseListener(dragMove);
        this.addMouseMotionListener(dragMove);

        title = buildMainPanel.returnLayoutTextfieldString(questionsBookTitle);
        lastName = buildMainPanel.returnLayoutTextfieldString(questionLastName);
        firstName = buildMainPanel.returnLayoutTextfieldString(questionFirstName);
        yearOfRelease = buildMainPanel.returnLayoutTextfieldInt(questionYearOfRelease);
        pageCount = buildMainPanel.returnLayoutTextfieldInt(questionPageCount);
        rating = buildMainPanel.returnLayoutTextfieldDouble(questionRating);
        readStatus = buildMainPanel.returnLayoutCheckBox(questionReadStatus);

        yearOfRelease.setToolTipText(toolTipYearOfRelease);
        pageCount.setToolTipText(toolTipPageCount);
        rating.setToolTipText(toolTipRating);

        buildMainPanel.buildButtons();

        SaveAction saveAction = new SaveAction(this, book);
        buildMainPanel.buttonConfirmation.addActionListener(saveAction);

        CancelAction cancelAction = new CancelAction(this);
        buildMainPanel.buttonCancel.addActionListener(cancelAction);

        this.setContentPane(buildMainPanel);

        this.setPreferredSize(new Dimension(width, height));
        this.pack();

        this.setVisible(true);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

        this.setLocationRelativeTo(null);

    }

    public String getTitle() {
        return title.getText();
    }

    public String getAuthorLastName() {
        return lastName.getText();
    }

    public String getAuthorFirstName() {
        return firstName.getText();
    }

    public int getYearOfRelease() {
        if (yearOfRelease.getText().equals("")) {
            return 0;

        } else {
            return Integer.parseInt(yearOfRelease.getText());
        }

    }

    public int getPageCount() {
        if (pageCount.getText().equals("")) {
            return 0;

        } else {
            return Integer.parseInt(pageCount.getText());
        }
    }

    public double getRating() {
        if (rating.getText().equals("")) {
            return 0;
        } else {
            return Double.parseDouble(rating.getText());
        }
    }

    public Boolean getReadStatus() {
        return readStatus.isSelected();
    }

}

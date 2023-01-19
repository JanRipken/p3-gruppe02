package main.tomedb.java.mainframe.view.menubar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import main.tomedb.java.mainframe.view.MainFrame;

public class BuildMenuBar extends JMenuBar {

    private JMenuBar menuBar;
    private BuildFileDropDownMenu buildFileDropDownMenu;
    private BuildHideColumnsDropDownMenu buildHideColumnsDropDownMenu;

    public BuildMenuBar() {

        menuBar = new JMenuBar();

        buildFileDropDownMenu = new BuildFileDropDownMenu();
        JMenu fileDropDownMenu = buildFileDropDownMenu.returnFileDropDownMenu();

        JLabel mainFrameTitle = new JLabel(MainFrame.title);

        try {
            buildHideColumnsDropDownMenu = new BuildHideColumnsDropDownMenu();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuildMenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JMenu hideColumnsDropDownMenu = buildHideColumnsDropDownMenu.returnHideColumnsJMenu();

        BuildCloseButton buildCloseMainFrame = new BuildCloseButton();
        JButton closeMainFrameButton = buildCloseMainFrame.returnCloseMainFrameButton();

        BuildSettingsButton buildSettingsButton = new BuildSettingsButton();
        JButton settingsButton = buildSettingsButton.returnSettingsButton();

        BuildMinimizeButton buildMinimizeButton = new BuildMinimizeButton();
        JButton minimizeButton = buildMinimizeButton.returnMinimizeButton();

        menuBar.add(fileDropDownMenu);
        menuBar.add(hideColumnsDropDownMenu);

        
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(Box.createHorizontalGlue());

        menuBar.add(mainFrameTitle);

        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(Box.createHorizontalGlue());

        menuBar.add(settingsButton);
        menuBar.add(minimizeButton);
        menuBar.add(closeMainFrameButton);
    }

    public JMenuBar returnMenuBar() {
        
        return menuBar;
    }
}

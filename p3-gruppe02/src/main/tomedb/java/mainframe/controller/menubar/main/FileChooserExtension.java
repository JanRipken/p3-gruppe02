package main.tomedb.java.mainframe.controller.menubar.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class FileChooserExtension extends JComponent implements PropertyChangeListener {

    private File file = null;
    private final DefaultListModel model;
    private final JList list;
    private final JButton removeItem;

    @SuppressWarnings("unchecked")
    public FileChooserExtension(JFileChooser chooser) {
        chooser.addPropertyChangeListener(this);

        model = new DefaultListModel();

        list = new JList(model);

        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(250, 250));

        removeItem = createRemoveItemButton();

        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new BorderLayout());
        add(pane);
        add(removeItem, BorderLayout.SOUTH);

    }

    public DefaultListModel getModel() {
        return model;
    }

    @SuppressWarnings("unchecked")
    private void addFileToList() {
        model.addElement(file);
    }

    private void removeFileFromList() {
        if (list.getSelectedIndex() != -1) {
            model.remove(list.getSelectedIndex());
        }
    }

    private JButton createRemoveItemButton() {
        JButton button = new JButton("Löschen");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeFileFromList();
            }
        });
        return button;
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        boolean update = false;
        String prop = e.getPropertyName();

        if (JFileChooser.DIRECTORY_CHANGED_PROPERTY.equals(prop)) {
            file = null;
            update = true;
        } else if (JFileChooser.SELECTED_FILE_CHANGED_PROPERTY.equals(prop)) {
            file = (File) e.getNewValue();
            update = true;
        }

        if (update && file != null) {
            addFileToList();
        }
    }
}
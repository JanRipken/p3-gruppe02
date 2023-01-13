package main.tomedb.java.mainframe.view;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.newbookframe.controller.EditBookAction;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.controller.jtable.DeleteBook;

public class Table {

    public static BookModelList bookModelList;
    public JTable jTable;
    public DefaultTableModel defaultTableMode;
    public JPopupMenu popupMenu;
    public static JMenuItem menuItemRemove;
    public static JMenuItem menuItemEdit;
    
    private Color selectedRowColor = Color.GRAY.darker();

    private static final String[] tableHeader = new String[]{
        "Titel",
        "Name",
        "Vorname",
        "Erscheinungsjahr",
        "Seitenanzahl",
        "Bewertung",
        "Gelesen"
    };

    public Table() {

        bookModelList = new BookModelList();

        defaultTableMode = new DefaultTableModel(0, tableHeader.length) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                Class contentDefinitionClass = String.class;
                switch (columnIndex) {
                    case 0:
                        contentDefinitionClass = String.class;
                        break;
                    case 1:
                        contentDefinitionClass = String.class;
                        break;
                    case 2:
                        contentDefinitionClass = String.class;
                        break;
                    case 3:
                        contentDefinitionClass = Integer.class;
                        break;
                    case 4:
                        contentDefinitionClass = Integer.class;
                        break;
                    case 5:
                        contentDefinitionClass = Double.class;
                        break;
                    case 6:
                        contentDefinitionClass = Boolean.class;
                        break;
                }
                return contentDefinitionClass;
            }

        };

        defaultTableMode.setColumnIdentifiers(tableHeader);

        jTable = new JTable(defaultTableMode);

        jTable.setSelectionBackground(selectedRowColor);

        jTable.getTableHeader().setReorderingAllowed(false);

        jTable.setFocusable(false);
        jTable.setAutoCreateRowSorter(true);

        ((JComponent) jTable.getDefaultRenderer(Boolean.class)).setOpaque(true);

        JPopupMenu tablePopupMenu = new JPopupMenu();

        JMenuItem menuItemRemove = new JMenuItem("Auswahl Löschen");
        JMenuItem menuItemEdit = new JMenuItem("Buch Bearbeiten");

        DeleteBook deleteBookAction = new DeleteBook();
        EditBookAction editBookAction = new EditBookAction();

        menuItemRemove.addActionListener(deleteBookAction);
        menuItemEdit.addActionListener(editBookAction);

        tablePopupMenu.add(menuItemRemove);
        tablePopupMenu.add(menuItemEdit);

        jTable.setComponentPopupMenu(tablePopupMenu);
    }

    // TODO: in den Controller packen
    public void addToTable(BookModel book) {
        bookModelList.addBook(book);
        addRowtoTable();
    }

    public void editToTable(BookModel book) {
        addRowtoTable();
    }

    public void addRowtoTable() {
        defaultTableMode.setRowCount(0);

        for (int i = 0; i < bookModelList.bookModelArrayList.size(); i++) {

            Object[] data = {bookModelList.bookModelArrayList.get(i).getTitle(),
                bookModelList.bookModelArrayList.get(i).getAuthorLastName(),
                bookModelList.bookModelArrayList.get(i).getAuthorFirstName(),
                bookModelList.bookModelArrayList.get(i).getYearOfRelease(),
                bookModelList.bookModelArrayList.get(i).getPageCount(),
                bookModelList.bookModelArrayList.get(i).getRating(),
                bookModelList.bookModelArrayList.get(i).getReadStatus()};
            defaultTableMode.addRow(data);

        }
    }
}

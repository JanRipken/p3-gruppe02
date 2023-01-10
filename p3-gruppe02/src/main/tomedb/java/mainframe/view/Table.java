package main.tomedb.java.mainframe.view;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.tomedb.java.newbookframe.controller.EditBook;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.controller.jtable.Delete;
import main.tomedb.java.newbookframe.controller.NewBook;

public class Table {

    public static BookModelList list;
    public JTable table;
    public DefaultTableModel model;
    public JPopupMenu popupMenu;
    public static JMenuItem menuItemAdd;
    public static JMenuItem menuItemRemove;
    public static JMenuItem menuItemEdit;

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

        list = new BookModelList();

        model = new DefaultTableModel(0, tableHeader.length) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                Class clazz = String.class;
                switch (columnIndex) {
                    case 0:
                        clazz = String.class;
                        break;
                    case 1:
                        clazz = String.class;
                        break;
                    case 2:
                        clazz = String.class;
                        break;
                    case 3:
                        clazz = Integer.class;
                        break;
                    case 4:
                        clazz = Integer.class;
                        break;
                    case 5:
                        clazz = Double.class;
                        break;
                    case 6:
                        clazz = Boolean.class;
                        break;
                }
                return clazz;
            }

        };

        model.setColumnIdentifiers(tableHeader);

        table = new JTable(model);

        table.setSelectionBackground(Color.GRAY.darker());

        table.getTableHeader().setReorderingAllowed(false);

        table.setFocusable(false);
        table.setAutoCreateRowSorter(true);

        ((JComponent) table.getDefaultRenderer(Boolean.class)).setOpaque(true);

        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem menuItemRemove = new JMenuItem("Remove Rows");
        JMenuItem menuItemEdit = new JMenuItem("Edit Rows");

        Delete tableListenerDelete = new Delete();
        EditBook tableListenerEdit = new EditBook();

        menuItemRemove.addActionListener(tableListenerDelete);
        menuItemEdit.addActionListener(tableListenerEdit);

        popupMenu.add(menuItemRemove);
        popupMenu.add(menuItemEdit);

        table.setComponentPopupMenu(popupMenu);
    }

    // TODO: in den Controller packen
    public void addToTable(BookModel book) {
        list.addBook(book);
        addRowtoTable();
    }

    public void editToTable(BookModel book) {
        addRowtoTable();
    }

    public void addRowtoTable() {
        model.setRowCount(0);

        for (int i = 0; i < list.bookModelList.size(); i++) {

            Object[] data = {list.bookModelList.get(i).getTitle(),
                list.bookModelList.get(i).getAuthorLastName(),
                list.bookModelList.get(i).getAuthorFirstName(),
                list.bookModelList.get(i).getYearOfRelease(),
                list.bookModelList.get(i).getPageCount(),
                list.bookModelList.get(i).getRating(),
                list.bookModelList.get(i).getReadStatus()};
            model.addRow(data);

        }
    }
}

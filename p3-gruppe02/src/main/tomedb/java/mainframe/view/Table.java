package main.tomedb.java.mainframe.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import main.tomedb.java.editbookframe.controller.EditBook;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.controller.JTableMouseListener;
import main.tomedb.java.mainframe.controller.JTableActionListenerDelete;
import main.tomedb.java.mainframe.controller.JTableActionListenerEdit;

public class Table {

    public static BookModelList list;
    public JTable table;
    public DefaultTableModel model;
    public JPopupMenu popupMenu;
    public static JMenuItem menuItemAdd;
    public static JMenuItem menuItemRemove;
    public static JMenuItem menuItemEdit;

    // Setting the Headers for our Table
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

        // rendering der Boolean spalte ( geht nicht ohne da ein bug im java jdk)
        ((JComponent) table.getDefaultRenderer(Boolean.class)).setOpaque(true);

        // creating popupMenu and adding to the table
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem menuItemRemove = new JMenuItem("Remove Rows");
        JMenuItem menuItemEdit = new JMenuItem("Edit Rows");

        JTableActionListenerDelete tableListenerDelete = new JTableActionListenerDelete();
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
    public void addEditToTable(BookModel book){
        addRowtoTable();
    }

    public void addRowtoTable() {
        model.setRowCount(0);

        for (int i = 0; i < list.bookModelList.size(); i++) {

            Object[] data = {list.bookModelList.get(i).getTitel(),
                list.bookModelList.get(i).getAutorName(),
                list.bookModelList.get(i).getAutorVorname(),
                list.bookModelList.get(i).getErscheinungsjahr(),
                list.bookModelList.get(i).getSeitenanzahl(),
                list.bookModelList.get(i).getBewertung(),
                list.bookModelList.get(i).getGelesen()};
            model.addRow(data);

        }
    }

}

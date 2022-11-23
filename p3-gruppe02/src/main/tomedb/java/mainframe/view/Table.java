package main.tomedb.java.mainframe.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import main.tomedb.java.mainframe.model.BookModel;
import main.tomedb.java.mainframe.model.BookModelList;

public class Table {

    public static BookModelList list;
    public JTable table;
    public DefaultTableModel model;

    // Setting the Headers for our Table
    private static final String[] tableHeader = new String[] {
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

        // TODO: Eigene klasse hierfür Schreiben
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

        // setting every 2nd row in oir table to another color
        // TODO: eigene klasse ?
        table = new JTable(model) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component comp = super.prepareRenderer(renderer, row, column);
                if (!comp.getBackground().equals(getSelectionBackground())) {
                    Color c = (row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                    comp.setBackground(c);
                    c = null;
                }
                return comp;
            }
        };

        table.setSelectionBackground(Color.GRAY);
        table.setForeground(Color.BLACK);

        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setForeground(Color.BLACK);
        table.setFocusable(false);
        table.setAutoCreateRowSorter(true);

        // TODO: Löschen
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) { // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    int column = target.getSelectedColumn(); // select a column
                    JOptionPane.showMessageDialog(null, table.getValueAt(row, column)); // get the value of a row and
                                                                                        // column.
                }
            }
        });

    }

    // TODO: in den Controller packen
    public void addToTable(BookModel book) {
        list.addBook(book);
        addRowtoTable();
    }

    public void addRowtoTable() {
        model.setRowCount(0);

        for (int i = 0; i < list.bookModelList.size(); i++) {

            Object[] data = { list.bookModelList.get(i).getTitel(),
                    list.bookModelList.get(i).getAutorName(),
                    list.bookModelList.get(i).getAutorVorname(),
                    list.bookModelList.get(i).getErscheinungsjahr(),
                    list.bookModelList.get(i).getSeitenanzahl(),
                    list.bookModelList.get(i).getBewertung(),
                    list.bookModelList.get(i).getGelesen() };
            model.addRow(data);

        }
    }

}

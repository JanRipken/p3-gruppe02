package view.MainFrames;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.BookModel;
import model.BookModelList;

public class SouthPanelJTable {

    //erstellen der einzelnen listen
    public static BookModelList list;
    JTable table;
    DefaultTableModel model;

    // setzen der überschriften für den jTable
    private static final String[] tableHeader = new String[]{
        "Titel",
        "Name",
        "Vorname",
        "Erscheinungsjahr",
        "Seitenanzahl",
        "Bewertung",
        "Gelesen"
    };

    public SouthPanelJTable() {
        list = new BookModelList();
        model = new DefaultTableModel(0, tableHeader.length) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        model.setColumnIdentifiers(tableHeader);

        // init des JTables
        table = new JTable();
        table.setModel(model);

        // verhindern das man die zellen verschieben kann
        table.getTableHeader().setReorderingAllowed(false);
        
        table.setFocusable(false);
        
        // testweise double click events
        table.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent me) {
            if (me.getClickCount() == 2) {     // to detect doble click events
               JTable target = (JTable)me.getSource();
               int row = target.getSelectedRow(); // select a row
               int column = target.getSelectedColumn(); // select a column
              JOptionPane.showMessageDialog(null, table.getValueAt(row, column)); // get the value of a row and column.
            }
         }
      });
        

    }

    // Das neu erstellte buch zur BookModelList hinzufügen
    public void addToTable(BookModel book) {
        list.addBook(book);
        addRowtoTable();
    }

    public void addRowtoTable() {
        model.setRowCount(0);
        for (int i = 0; i < list.bookModelList.size(); i++) {

            String bookTitel = list.bookModelList.get(i).getTitel();
            String bookAutorName = list.bookModelList.get(i).getAutorName();
            String bookAutorVorname = list.bookModelList.get(i).getAutorVorname();
            Integer bookErscheinungsjahr = list.bookModelList.get(i).getErscheinungsjahr();
            Integer bookSeitenanzahl = list.bookModelList.get(i).getSeitenanzahl();
            Double bookBewertung = list.bookModelList.get(i).getBewertung();
            Boolean bookGelesen = list.bookModelList.get(i).getGelesen();

            Object[] data = {bookTitel, bookAutorName, bookAutorVorname, bookErscheinungsjahr, bookSeitenanzahl, bookBewertung, bookGelesen};

            model.addRow(data);

        }
    }

}
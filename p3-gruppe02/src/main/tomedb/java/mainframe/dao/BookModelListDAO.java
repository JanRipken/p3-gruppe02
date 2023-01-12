package main.tomedb.java.mainframe.dao;

import main.tomedb.java.mainframe.model.BookModelList;
import main.tomedb.java.mainframe.model.BookModel;
import java.io.IOException;

public class BookModelListDAO extends DAO {

    /**
     * Konstruktor um das Data Access Object mit einem Dateinamen zu
     * initialisieren.
     *
     * @param fileName Dateiname
     * @param openForWrite true wenn geschrieben werden soll
     */
    public BookModelListDAO(String fileName, boolean openForWrite) {
        super(fileName, openForWrite);
    }

    public void write(Object obj) throws IOException {
        if (out != null) {
            BookModelList bookList = (BookModelList) obj;
            out.writeInt(bookList.bookModelList.size());

            BookModelDAO bookModelDAO = new BookModelDAO(null, out);

            for (BookModel b : bookList.bookModelList) {
                bookModelDAO.write(b);
            }
        }
    }

    public void read(Object obj) throws IOException {
        if (in != null) {
            BookModelList bookList = (BookModelList) obj;

            int nBookModel = in.readInt();

            BookModelDAO bookModelDAO = new BookModelDAO(in, null);
            for (int i = 0; i < nBookModel; ++i) {
                BookModel b = new BookModel();
                bookModelDAO.read(b);
                bookList.addBook(b);
            }
        }
    }
}

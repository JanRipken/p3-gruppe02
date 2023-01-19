package main.tomedb.java.mainframe.controller.dao;

import main.tomedb.java.main.model.BookModelList;
import main.tomedb.java.main.model.BookModel;
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
            BookModelList bookModelList = (BookModelList) obj;
            out.writeInt(bookModelList.bookModelArrayList.size());

            BookModelDAO bookModelDAO = new BookModelDAO(null, out);

            for (BookModel bookModel : bookModelList.bookModelArrayList) {
                bookModelDAO.write(bookModel);
            }
        }
    }

    
    public void read(Object obj) throws IOException {
        if (in != null) {
            BookModelList bookModelList = (BookModelList) obj;

            int nBookModel = in.readInt();

            BookModelDAO bookModelDAO = new BookModelDAO(in, null);
            for (int i = 0; i < nBookModel; ++i) {
                BookModel bookModel = new BookModel();
                bookModelDAO.read(bookModel);
                bookModelList.addBook(bookModel);
            }
        }
    }
}

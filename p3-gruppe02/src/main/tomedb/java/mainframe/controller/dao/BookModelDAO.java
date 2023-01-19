package main.tomedb.java.mainframe.controller.dao;

import main.tomedb.java.main.model.BookModel;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BookModelDAO extends DAO {
 
    /**
     * Konstruktor um das Data Access Object mit bereits vorhandenen Streams zu
     * initialisieren.
     *
     * @param in InputStream oder null
     * @param out OutputStream oder null
     */
    public BookModelDAO(DataInputStream in, DataOutputStream out) {
        super(in, out);
    }

    /**
     * Daten des übergebenen BookModel-Objekts schreiben. Das Data Access Object
     * muss dazu zum Schreiben bereit sein.
     *
     * @param obj Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void write(Object obj) throws IOException {
        if (out != null) {
            BookModel bookModel = (BookModel) obj;
            out.writeUTF(bookModel.getTitle());
            out.writeUTF(bookModel.getAuthorLastName());
            out.writeUTF(bookModel.getAuthorFirstName());
            out.writeInt(bookModel.getPageCount());
            out.writeBoolean(bookModel.getReadStatus());
            out.writeDouble(bookModel.getRating());
            out.writeInt(bookModel.getYearOfRelease());
        }
    }

    /**
     * Daten des übergebenen BookModel-Objekts lesen. Das Data Access Objekt muss
     * dazu zum Lesen bereit sein.
     *
     * @param obj Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void read(Object obj) throws IOException {
        if (in != null) {
            BookModel bookModel = (BookModel) obj;
            bookModel.setTitle(in.readUTF());
            bookModel.setAuthorLastName(in.readUTF());
            bookModel.setAuthorFirstName(in.readUTF());
            bookModel.setPageCount(in.readInt());
            bookModel.setReadStatus(in.readBoolean());
            bookModel.setRating(in.readDouble());
            bookModel.setYearOfRelease(in.readInt());
        }
    }
}

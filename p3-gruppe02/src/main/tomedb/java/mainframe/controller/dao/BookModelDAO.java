package main.tomedb.java.mainframe.controller.dao;

import main.tomedb.java.main.model.BookModel;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BookModelDAO extends DAO {

    /**
     * Konstruktor um das Data Access Object mit einem Dateinamen zu
     * initialisieren.
     *
     * @param fileName Dateiname
     * @param openForWrite true wenn geschrieben werden soll
     */
    public BookModelDAO(String fileName, boolean openForWrite) {
        super(fileName, openForWrite);
    }

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
     * Daten des übergebenen Student-Objekts schreiben. Das Data Access Object
     * muss dazu zum Schreiben bereit sein.
     *
     * @param obj Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void write(Object obj) throws IOException {
        if (out != null) {
            BookModel b = (BookModel) obj;
            out.writeUTF(b.getTitle());
            out.writeUTF(b.getAuthorLastName());
            out.writeUTF(b.getAuthorFirstName());
            out.writeInt(b.getPageCount());
            out.writeBoolean(b.getReadStatus());
            out.writeDouble(b.getRating());
            out.writeInt(b.getYearOfRelease());
        }
    }

    /**
     * Daten des übergebenen Student-Objekts lesen. Das Data Access Objekt muss
     * dazu zum Lesen bereit sein.
     *
     * @param obj Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void read(Object obj) throws IOException {
        if (in != null) {
            BookModel b = (BookModel) obj;
            b.setTitle(in.readUTF());
            b.setAuthorLastName(in.readUTF());
            b.setAuthorFirstName(in.readUTF());
            b.setPageCount(in.readInt());
            b.setReadStatus(in.readBoolean());
            b.setRating(in.readDouble());
            b.setYearOfRelease(in.readInt());
        }
    }
}

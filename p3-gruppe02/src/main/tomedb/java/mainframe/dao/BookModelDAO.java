package main.tomedb.java.mainframe.dao;

import main.tomedb.java.mainframe.model.BookModel;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BookModelDAO extends DAO {

    /**
     * Konstruktor um das Data Access Object mit einem Dateinamen zu
     * initialisieren.
     *
     * @param dateiName Dateiname
     * @param openForWrite true wenn geschrieben werden soll
     */
    public BookModelDAO(String dateiName, boolean openForWrite) {
        super(dateiName, openForWrite);
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
     * @param b Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void write(Object obj) throws IOException {
        if (out != null) {
            BookModel b = (BookModel) obj;
            out.writeUTF(b.getTitel());
            out.writeUTF(b.getAutorName());
            out.writeUTF(b.getAutorVorname());
            out.writeInt(b.getSeitenanzahl());
            out.writeBoolean(b.getGelesen());
            out.writeDouble(b.getBewertung());
            out.writeInt(b.getErscheinungsjahr());
        }
    }

    /**
     * Daten des übergebenen Student-Objekts lesen. Das Data Access Objekt muss
     * dazu zum Lesen bereit sein.
     *
     * @param b Referenz auf BookModel-Objekt
     * @throws IOException
     */
    @Override
    public void read(Object obj) throws IOException {
        if (in != null) {
            BookModel b = (BookModel) obj;
            b.setTitel(in.readUTF());
            b.setAutorName(in.readUTF());
            b.setAutorVorname(in.readUTF());
            b.setSeitenanzahl(in.readInt());
            b.setGelesen(in.readBoolean());
            b.setBewerung(in.readDouble());
            b.setErscheinungsjahr(in.readInt());
        }
    }
}

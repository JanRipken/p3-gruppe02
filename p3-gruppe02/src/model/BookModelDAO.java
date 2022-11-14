/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DAO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author matthiaskoziol
 */
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
     * @param s Referenz auf Student-Objekt
     * @throws IOException
     */
    public void write(Object obj) throws IOException {
        if (out != null) {
            BookModel b = (BookModel) obj;
            out.writeUTF(b.getName());
            out.writeInt(b.getMatnr());
            out.writeBoolean(b.getBestanden());
            out.writeDouble(b.getNote());
        }
    }

    /**
     * Daten des übergebenen Student-Objekts lesen. Das Data Access Objekt muss
     * dazu zum Lesen bereit sein.
     *
     * @param s Referenz auf Student-Objekt
     * @throws IOException
     */
    public void read(Object obj) throws IOException {
        if (in != null) {
            Student s = (Student) obj;
            s.setName(in.readUTF());
            s.setMatnr(in.readInt());
            s.setBestanden(in.readBoolean());
            s.setNote(in.readDouble());
        }
    }



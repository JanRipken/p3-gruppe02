package main.java.mainframe.model;

import main.java.mainframe.model.BookModel;
import java.util.ArrayList;

public class BookModelList {
    
    // erzeugen der ArrayListe
    public ArrayList<BookModel> bookModelList;
    
    public BookModelList(){
    bookModelList = new ArrayList<>();
    }

    public void addBook(BookModel book) {
        bookModelList.add(book);
    }
}

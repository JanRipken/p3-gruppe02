package main.tomedb.java.mainframe.model;

import java.util.ArrayList;

public class BookModelList {

    // start an ArrayList
    public ArrayList<BookModel> bookModelList;

    public BookModelList() {
        bookModelList = new ArrayList<>();
    }

    public void addBook(BookModel book) {
        bookModelList.add(book);
    }
}
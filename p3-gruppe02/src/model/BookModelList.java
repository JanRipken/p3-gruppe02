package model;

import java.util.ArrayList;

public class BookModelList {

    public ArrayList<BookModel> bookModelList = new ArrayList<>();

    public void addBook(BookModel book) {
        bookModelList.add(book);
    }
}

package main.tomedb.java.mainframe.model;

import java.util.ArrayList;

public class BookModelList {

    public static ArrayList<BookModel> bookModelList;

    public BookModelList() {
        bookModelList = new ArrayList<>();
    }

    public void addBook(BookModel bookModel) {
        bookModelList.add(bookModel);
    }

    public void deleteBook(int index) {
        bookModelList.remove(index);
    }

    public BookModel getBook(int index) {
        return bookModelList.get(index);
    }
}
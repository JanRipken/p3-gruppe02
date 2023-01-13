package main.tomedb.java.mainframe.model;

import java.util.ArrayList;

public class BookModelList {

    public static ArrayList<BookModel> bookModelArrayList;

    public BookModelList() {
        bookModelArrayList = new ArrayList<>();
    }

    public void addBook(BookModel bookModel) {
        bookModelArrayList.add(bookModel);
    }

    public void deleteBook(int index) {
        bookModelArrayList.remove(index);
    }

    public BookModel getBook(int index) {
        return bookModelArrayList.get(index);
    }
}
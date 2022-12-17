package main.tomedb.java.mainframe.model;

import java.util.ArrayList;

public class BookModelList {

    // start an ArrayList
    public static ArrayList<BookModel> bookModelList;

    public BookModelList() {
        bookModelList = new ArrayList<>();
    }

    public void addBook(BookModel book) {
        bookModelList.add(book);
    }

    public void deleteBook(int book) {        
        bookModelList.remove(book);      
    }

    public void editBook(int index, BookModel book) {
        bookModelList.set(index, book);

    }

    public int size() {
        return bookModelList.size();
    }

    public BookModel get(int i) {
       return bookModelList.get(i);
    }
    
   

}

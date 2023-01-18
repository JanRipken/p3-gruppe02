package main.tomedb.java.main.model;

import java.util.ArrayList;

public class BookModelList {

    public static ArrayList<BookModel> bookModelArrayList;

    public BookModelList() {
        bookModelArrayList = new ArrayList<>();
    }

    public void addBook(BookModel bookModel) {
        bookModelArrayList.add(bookModel);
    }

    public void deleteBook(int book) {
        for (int i = 0; i < bookModelArrayList.size(); i++) {
            if (bookModelArrayList.get(i).equals(book)) {
                bookModelArrayList.remove(i);

            }
        }
    }

     public void updateBook(BookModel book, int index) {
        bookModelArrayList.set(index, book);
    }

    public BookModel getBook(int index) {
        return bookModelArrayList.get(index);
    }
}

package main;

import java.util.ArrayList;

public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books on the shelf.");
        } else {
            System.out.println("Books on the shelf:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}


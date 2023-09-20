package org.example;

import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;

    private ArrayList<Book> books;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book1) {
        if (books.size() < capacity) {
            books.add(book1);
        }
    }

    public int countBooks() {
        return books.size();
    }

    public void loanBook(Book book, Borrower borrower) {
        if(this.books.contains(book)){
            this.books.remove(book);
            borrower.addBook(book);
        }
    }

}

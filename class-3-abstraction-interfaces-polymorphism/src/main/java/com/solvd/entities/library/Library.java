package com.solvd.entities.library;

import com.solvd.interfaces.library.ILibrary;

import java.util.List;

public class Library implements ILibrary {
    private List<Book> bookList;
    private String university; // belongs to which university.
    private static final boolean RETIRED = true;

    public Library(List<Book> bookList, String universityName) {
        this.bookList = bookList;
        this.university = universityName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return this.getUniversity();
    }

    @Override
    public void withdrawBook(Book book) {
        for (Book b : this.bookList) {
            if (b.getRetired()) {
                System.out.println("This book is already Retired");
            } else {
                b.setRetired(RETIRED);
            }
        }
    }

    @Override
    public void returnBook(Book book) {
        for (Book b : bookList) {
            if (b.equals(book) && b.getRetired()) {
                b.setRetired(false);
                System.out.println("Thank you for Returning the book");
            }
        }
    }

    public int getTotalBooks() {
        return bookList.size();
    }

    public void getBooksByType() {
    }
}

package com.jsp.assignment6.Model;

import java.util.List;

public class Library {
    private List<Book> books; // Multiple books injected via List

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
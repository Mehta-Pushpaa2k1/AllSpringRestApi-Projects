package com.jsp.assignment6.Driver;

import com.jsp.assignment6.Model.Book;
import com.jsp.assignment6.Model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Spring Container load karna using library-config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("library-config.xml");

        // Library bean fetch karna
        Library library = (Library) context.getBean("library");

        // Displaying all available books in the library
        System.out.println("=== AVAILABLE BOOKS IN LIBRARY ===");
        int count = 1;
        for (Book book : library.getBooks()) {
            System.out.println(count + ". Title: " + book.getTitle() + " | Author: " + book.getAuthor());
            count++;
        }
    }
}
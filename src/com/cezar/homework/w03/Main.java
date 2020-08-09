/**
 * Create a small application that mimics a library catalog. It needs to be able to add books, delete books and list books.
 * Books are of two kinds: novels and art albums. They both have names and number of pages. Novels have type (like mystery, sf, etc.)
 * while albums have paper quality.
 *
 * Model these entities (book, novel, album) with different classes and inheritance.
 *
 * Creation date: 09.08.2020
 * @author cezar
 */

package com.cezar.homework.w03;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        /**
         * main method of the Main class
         */
        // write your code here
        ArrayList<Book> libCatalog;
        libCatalog = new ArrayList<Book>();

        Novel book1 = new Novel();
        book1.setBookName("Dune");
        book1.setNovelType("Science Fiction");
        book1.setNoOfPages(661);

        Album book2 = new Album();
        book2.setBookName("National Geographic Traveler: Vietnam");
        book2.setNoOfPages(271);
        book2.setPaperQuality("Very good");

        System.out.println(book1.getBookName());
        libCatalog.add(book1);
        libCatalog.add(book2);
        System.out.println(libCatalog.size());

        //list the books from the catalog;
    }
}

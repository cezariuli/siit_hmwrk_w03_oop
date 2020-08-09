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
        libCatalog.add(book1);

        Album book2 = new Album();
        book2.setBookName("National Geographic Traveler: Vietnam");
        book2.setNoOfPages(271);
        book2.setPaperQuality("Very good");
        libCatalog.add(book2);

        Novel book3 = new Novel();
        book3.setBookName("The Girl with the Dragon Tattoo");
        book3.setNoOfPages(465);
        book3.setNovelType("Mystery");
        libCatalog.add(book3);

        Album book4 = new Album();
        book4.setBookName("Africa in the wild");
        book4.setNoOfPages(184);
        book4.setPaperQuality("Poor");
        libCatalog.add(book4);

        Novel book5 = new Novel();
        book5.setBookName("Harry Potter and the Sorcerer's Stone");
        book5.setNoOfPages(309);
        book5.setNovelType("Children");
        libCatalog.add(book5);

        System.out.println(libCatalog.size());

        //list the books from the catalog;
        for (Book item: libCatalog) {
            System.out.println(item.getBookName());
        }

        libCatalog.remove(book5);

        for (Book item: libCatalog) {
            System.out.println(item.getBookName());
        }
    }
}

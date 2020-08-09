package com.cezar.homework.w03;

public class Book {

    private String bookName;
    private int noOfPages = 0;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}

class Novel extends Book {

    private String novelType;

    public String getNovelType(){
        /**
         * Method for getting the novel type
         */
        return this.novelType;
    }

    public void setNovelType(String type) {
        /**
         * Method for setting the novel type
         */
        this.novelType = type;
    }
}

class Album extends Book{

    private String paperQuality;

    public String getPaperQuality() {
        /**
         * This method returns the paper quality of the art album
         */
        return this.paperQuality;
    }

    public void setPaperQuality(String quality) {
        /**
         * This method sets the paper quality of the art album
         */

    }
}
package com.startjava.graduation.bookshelf;

public class Books {
    private final String author;
    private final String title;
    private final String yearPublishing;
    private final int infoLen;

    public Books(String author, String title, String yearPublishing) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
        infoLen = author.length() + title.length() + yearPublishing.length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLen() {
        return infoLen;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublishing;
    }
}

package com.startjava.graduation.bookshelf;

public class Books {
    private final String author;

    private final String bookName;

    private final int publishedIn;

    private final int infoLen;

    public Books(String author, String bookName, int publishedIn) {
        this.author = author;
        this.bookName = bookName;
        this.publishedIn = publishedIn;
        infoLen = author.length() + bookName.length() + String.valueOf(publishedIn).length();
    }

    public int getInfoLen() {
        return infoLen;
    }

    public String toString() {
        return author + ", " + bookName + ", " + publishedIn;
    }

}

package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int SHELF_LIMIT = 10;
    private int numBooks;
    private final Books[] books = new Books[SHELF_LIMIT];
    private int maxLen;

    public int getNumBooks() {
        return numBooks;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void add(Books book) {
        if (numBooks >= SHELF_LIMIT) {
            System.out.println("There's no free space for books. Clear the bookshelf");
            return;
        }
        books[numBooks] = book;
        if (books[numBooks].getInfoLen() > maxLen) {
            maxLen = books[numBooks].getInfoLen();
        }
        numBooks++;
    }

    public Books find(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        int bookLen;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                bookLen = books[i].getInfoLen();
                numBooks--;
                System.arraycopy(books, i + 1, books, i, numBooks - i);
                books[numBooks] = null;
                if (bookLen == maxLen)  maxLen = numBooks >= 1 ? calcMaxLen() : 0;
                return true;
            }
        }
        return false;
    }

    public Books[] getAll() {
        Books[] tempArray = new Books[numBooks];
        System.arraycopy(books, 0, tempArray, 0, numBooks);
        return tempArray;
    }

    public int getFreeShelves() {
        return SHELF_LIMIT - numBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, numBooks, null);
        numBooks = 0;
    }

    private int calcMaxLen() {
        int maxLen = books[0].getInfoLen();
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getInfoLen() > maxLen) maxLen = books[i].getInfoLen();
        }
        return maxLen;
    }
}




package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final int LENGTH = 10;
    private int numBooks;
    private final Books[] books = new Books[LENGTH];
    private int maxLen;

    public int getNumBooks() {
        return numBooks;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void add(Books book) {
        if (numBooks >= LENGTH) {
            System.out.println("There's no free space for books. Clear the bookshelf");
            return;
        }
        books[numBooks] = book;
        if (books[numBooks].getInfoLen() > maxLen) {
            maxLen = books[numBooks].getInfoLen();
            numBooks++;
        }
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
                if (i == numBooks-1) {
                    books[i] = null;
                } else {
                    System.arraycopy(books, i + 1, books, i, numBooks - i - 1);
                }
                numBooks--;
                if (bookLen == maxLen) {
                    if (numBooks >= 1 ) {
                        maxLen = calcMaxLen();
                    } else {
                        maxLen = 0;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Books[] getAll() {
        return books;
    }

    public int getFreeShelves() {
        return LENGTH - numBooks;
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




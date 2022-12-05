package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public int numBooks;
    private final Books[] books = new Books[10];
    private int maxLen;

    public void add(Books book) {
        if (numBooks >= books.length) {
            System.out.println("There's no free space for books. Clear the bookshelf");
            return;
        }
        books[numBooks] = book;
        if (books[numBooks].getInfoLen() > maxLen) maxLen = books[numBooks].getInfoLen();
        numBooks++;
    }

    public String find(String required) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(required)) {
                return books[i].toString();
            }
        }
        return "There's no such book";
    }

    public boolean delete(String toDelete) {
        int toCheck;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(toDelete)) {
                toCheck = books[i].getInfoLen();
                System.arraycopy(books, i + 1, books, i, numBooks - i);
                numBooks--;
                if (toCheck == maxLen) maxLen = maxLen();
                return true;
            }
        }
        return false;
    }

    public void getAll() {
        String strRepeat = "-".repeat(maxLen + 4);
        for (Books book : books) {
            if (book != null)  {
                System.out.println("|" + book.toString() + " ".repeat(maxLen - book.getInfoLen()) + "|");
                System.out.printf("|" + strRepeat + "|\n");
            } else {
                System.out.println("|" + " ".repeat(maxLen + 4) + "|");
                break;
            }
        }
    }

    public int getFreeShelves() {
        return books.length - numBooks;
    }

    public void clear() {
        Arrays.fill(books, null);
        numBooks = 0;
    }

    private int maxLen() {
        int maxLen = books[0].getInfoLen();
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getInfoLen() > maxLen) maxLen = books[i].getInfoLen();
        }
        return maxLen;
    }
}




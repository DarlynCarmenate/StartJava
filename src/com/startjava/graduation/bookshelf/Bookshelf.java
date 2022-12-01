package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private int numOfBooks;

    private final Books[] books = new Books[10];

    public void addBook(String author, String bookName, int publishedIn) {
        Books book = new Books(author, bookName, publishedIn);
        int i;
        for (i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
        if (i >= books.length) System.out.println("There's no free space for books. Clear the bookshelf");
    }

    @Override
    public String toString() {
        String print = "";
        for (Books book : books) {
            if (book != null) print += book.toString() + "\n";
        }
        return print;
    }

    public String findBook(String required) {
        for (Books book : books) {
            if (book != null && book.toString().contains(required)) {
                return book.toString();
            }
        }
        return "There's no such book";
    }

    public boolean deleteBook(String toDelete) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].toString().contains(toDelete)) {
                System.arraycopy(books, i + 1, books, i, getNumOfBooks() - i);
                return true;
            }
        }
        return false;
    }

    public int maxLenBook() {
        int maxLen = books[0].getInfoLen();
        for (int i = 1; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getInfoLen() > maxLen) maxLen = books[i].getInfoLen();
            } else {
                break;
            }
        }
        return maxLen;
    }
    public void getAllBooks() {
        String strRepeat = "-".repeat(maxLenBook() + 4);
        int maxLen = maxLenBook();
        for (Books book : books) {
            if (book != null)  {
                System.out.println("|" + book.toString() + " ".repeat(maxLenBook() - book.getInfoLen()) + "|");
                System.out.printf("|" + strRepeat + "|\n");
            } else {
                System.out.println("|" + " ".repeat(maxLenBook() + 4) + "|");
                break;
            }
        }
    }

    public int getNumOfBooks() {
        int count = 0;
        for (Books book : books) {
            if (book != null) {
                count++;
            } else {
                break;
            }
        }
        numOfBooks = count;
        return numOfBooks;
    }

    public int getFreeShelves() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) count++;
        }
        return count;
    }

    public void clearBookshelf () {
        for (int i = 0; i < books.length; i++)
            if (books[i] != null) books[i] = null; else break;
    }
}




package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfMain {
    static Scanner scn = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        while (true) {
            drawBookshelf();
            printMenu();
            String command = scn.nextLine();
            if (!runCommand(command)) break;
            System.out.println("Press ENTER to continue");
            scn.nextLine();
        }
    }

    private static void drawBookshelf() {
        System.out.println("There are " + bookshelf.getNumBooks() + " books in a bookshelf\n" +
                "and " + bookshelf.getFreeShelves() + " free shelves");
        if (bookshelf.getNumBooks() == 0) {
            System.out.println("The bookshelf is empty. You can input the first book there");
        } else {
            Books[] booksDraw = bookshelf.getAll();
            String strRepeat = "-".repeat(bookshelf.getMaxLen() + 4);
            for (Books book : booksDraw) {
                if (book != null)  {
                    System.out.println("|" + book.toString() + " ".repeat(bookshelf.getMaxLen() -
                            book.getInfoLen()) + "|");
                    System.out.printf("|" + strRepeat + "|\n");
                } else {
                    System.out.println("|" + " ".repeat(bookshelf.getMaxLen() + 4) + "|");
                    break;
                }
            }
        }
    }

    private static void printMenu() {
        System.out.print("""
                1. delete <title>
                2. clear
                3. save <author> <title> <publishYear>
                4. find <title>
                5. quit
                """);
    }

    private static boolean runCommand(String answer) {
        switch (answer) {
            case "delete" -> {
                System.out.println("Please, input the book's name: ");
                String toDelete = scn.nextLine();
                if (!bookshelf.delete(toDelete)) {
                    System.out.println("The book can't be found");
                };
            }
            case "clear" -> bookshelf.clear();
            case "save" -> {
                System.out.println("Please, input the author: ");
                String author = scn.nextLine();
                System.out.println("Please, input the book's title: ");
                String title = scn.nextLine();
                System.out.println("Please, input the book's year if publishing: ");
                String yearPublishing = scn.nextLine();
                Books book = new Books(author, title, yearPublishing);
                bookshelf.add(book);
            }
            case "find" -> {
                System.out.println("Please, input the book's title: ");
                String required = scn.nextLine();
                Books foundBook = bookshelf.find(required);
                if (foundBook == null) {
                    System.out.println("The book is not found");
                } else {
                    System.out.println(foundBook);
                }
            }
            case "quit" ->  { return false; }
        }
        return true;
    }
}

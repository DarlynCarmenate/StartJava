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
        if (bookshelf.getNumBooks() == 0) {
            System.out.println("The bookshelf is empty. You can input the first book there");
        } else {
            System.out.println("There are " + bookshelf.getNumBooks() + " books in a bookshelf\n" +
                    "and " + bookshelf.getFreeShelves() + " free shelves");
            Books[] books = bookshelf.getAll();
            String border = "-".repeat(bookshelf.getMaxLen() + 4);
            for (Books book : books) {
                System.out.println("|" + book + " ".repeat(bookshelf.getMaxLen() -
                         book.getInfoLen()) + "|");
                System.out.println("|" + border + "|");
            }
            System.out.println("|" + " ".repeat(bookshelf.getMaxLen() + 4) + "|");
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
        return switch (answer) {
            case "delete" -> {
                System.out.println("Please, input the book's name: ");
                String title = scn.nextLine();
                if (!bookshelf.delete(title))
                    System.out.println("The book can't be found");
                yield true;
            }
            case "clear" -> {
                bookshelf.clear();
                yield true;
            }
            case "save" -> {
                System.out.println("Please, input the author: ");
                String author = scn.nextLine();
                System.out.println("Please, input the book's title: ");
                String title = scn.nextLine();
                System.out.println("Please, input the book's year if publishing: ");
                String yearPublishing = scn.nextLine();
                Books book = new Books(author, title, yearPublishing);
                bookshelf.add(book);
                yield true;
            }
            case "find" -> {
                System.out.println("Please, input the book's title: ");
                String title = scn.nextLine();
                Books foundBook = bookshelf.find(title);
                if (foundBook == null) {
                    System.out.println("The book is not found");
                } else {
                    System.out.println(foundBook);
                }
                yield true;
            }
            case "quit" -> false;
            default -> {
                System.out.println("The command is not supported");
                yield true;
            }
        };
    }
}

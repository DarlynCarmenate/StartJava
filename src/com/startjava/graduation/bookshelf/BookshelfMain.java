package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfMain {
    static Scanner scn = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        while (true) {
            drawBookshelf();
            printMenu();
            String command = getAnswer();
            if (!processCommand(command)) break;
            System.out.println("Press ENTER to continue");
            scn.nextLine();
        }
    }

    private static void drawBookshelf() {
        System.out.println("There are " + bookshelf.numBooks + " books in a bookshelf\n" +
                "and " + bookshelf.getFreeShelves() + " free shelves");
        if (bookshelf.numBooks == 0) {
            System.out.println("The bookshelf is empty. You can input the first book there");
        } else {
            bookshelf.getAll();
        }
    }

    private static void printMenu() {
        String menu = """
                1. delete <title>
                2. clear
                3. save <author> <title> <publishYear>
                4. find <title>
                5. quit
                """;
        System.out.print(menu);
    }

    private static String getAnswer() {
        return scn.nextLine();
    }

    private static boolean processCommand(String answer) {
        if (answer.contains("delete")) {
            System.out.println("Please, input the book's name: ");
            String toDelete = scn.nextLine();
            if (!bookshelf.delete(toDelete)) {
                System.out.println("The book can't be found");
            }
        } else if (answer.contains("clear")) {
            bookshelf.clear();
        } else if (answer.contains("save")) {
            System.out.println("Please, input the author: ");
            String author = scn.nextLine();
            System.out.println("Please, input the book's title: ");
            String title = scn.nextLine();
            System.out.println("Please, input the book's year if publishing: ");
            String yearPublishing = scn.nextLine();
            Books book = new Books(author, title, yearPublishing);
            bookshelf.add(book);
        } else if (answer.contains("find")) {
            System.out.println("Please, input the book's title: ");
            String required = scn.nextLine();
            System.out.println(bookshelf.find(required));
        } else if (answer.contains("quit")) {
            return false;
        }
        return true;
    }
}

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
        System.out.println("There are " + bookshelf.getNumOfBooks() + " books in a bookshelf\n" +
                "and " + bookshelf.getFreeShelves() + " free shelves");
        if (bookshelf.getNumOfBooks() == 0) {
            System.out.println("The bookshelf is empty. You can input the first book there");
        } else {
            bookshelf.getAllBooks();
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
            if (!bookshelf.deleteBook(toDelete)) {
                System.out.println("The book can't be found");
            }
        } else if (answer.contains("clear")) {
            bookshelf.clearBookshelf();
        } else if (answer.contains("save")) {
            System.out.println("Please, input the author: ");
            String author = scn.nextLine();
            System.out.println("Please, input the book's name: ");
            String bookName = scn.nextLine();
            System.out.println("Please, input the book's year if publishing: ");
            int publishedIn = scn.nextInt();
            scn.nextLine();
            bookshelf.addBook(author, bookName, publishedIn);
        } else if (answer.contains("find")) {
            System.out.println("Please, input the book's name: ");
            String required = scn.nextLine();
            System.out.println(bookshelf.findBook(required));
        } else if (answer.contains("quit")) {
            return false;
        }
        return true;
    }
}

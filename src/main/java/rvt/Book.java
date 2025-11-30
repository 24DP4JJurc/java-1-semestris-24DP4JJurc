package rvt;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title (leave empty to stop): ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            int pages;
            while (true) {
                System.out.print("Pages: ");
                String pageInput = scanner.nextLine();

                try {
                    pages = Integer.parseInt(pageInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("⚠ Invalid number. Try again.");
                }
            }

            int year;
            while (true) {
                System.out.print("Publication year: ");
                String yearInput = scanner.nextLine();

                try {
                    year = Integer.parseInt(yearInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("⚠ Invalid number. Try again.");
                }
            }

            books.add(new Book(title, pages, year));
        }

        System.out.print("\nWhat should be printed? (everything/name): ");
        String info = scanner.nextLine();

        System.out.println("\n--- OUTPUT ---");
        for (Book book : books) {
            if (info.equalsIgnoreCase("everything")) {
                System.out.println(book);
            } else if (info.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("⚠ Invalid command. Showing full list:");
                System.out.println(book);
            }
        }

        scanner.close();
    }
}


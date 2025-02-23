package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private List<Item> items;
    private FileHandler fileHandler;

    public LibrarySystem() {
        items = new ArrayList<>();
        fileHandler = new TextFileHandler(); 
    }

    public void addItem(int choice, Scanner scanner) {
        if (choice == 1) {
            System.out.print("Enter book ID:\n");
            String id = scanner.nextLine();
            System.out.print("Enter title:\n");
            String title = scanner.nextLine();
            System.out.print("Enter author:\n");
            String author = scanner.nextLine();

            Book book = new Book(id, title, author);
            items.add(book);
            System.out.println("Book added successfully.");
        } else if (choice == 2) {
            System.out.print("Enter DVD ID:\n");
            String id = scanner.nextLine();
            System.out.print("Enter title:\n");
            String title = scanner.nextLine();
            System.out.print("Enter duration (minutes):\n");
            int duration = Integer.parseInt(scanner.nextLine());

            DVD dvd = new DVD(id, title, duration);
            items.add(dvd);
            System.out.println("DVD added successfully.");
        }
    }

    public void removeItem(Scanner scanner) {
        System.out.print("Enter item ID to remove:\n");
        String idToRemove = scanner.nextLine();
        boolean removed = items.removeIf(item -> item.getId().equalsIgnoreCase(idToRemove));
        if (removed) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("No item found with that ID.");
        }
    }

    public void listAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the system.");
            return;
        }
        for (Item item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("ID: " + book.getId()
                        + ", Title: " + book.getTitle()
                        + ", Author: " + book.getAuthor());
            } else if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println("ID: " + dvd.getId()
                        + ", Title: " + dvd.getTitle()
                        + ", Duration: " + dvd.getDuration() + " minutes");
            }
        }
    }

    public void saveToFile(Scanner scanner) {
        System.out.print("Enter filename to save:\n");
        String filename = scanner.nextLine();
        try {
            fileHandler.saveItems(filename, items);
            System.out.println("Items saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving items to file: " + e.getMessage());
        }
    }

    public void loadFromFile(Scanner scanner) {
        System.out.print("Enter filename to load:\n");
        String filename = scanner.nextLine();
        try {
            List<Item> loadedItems = fileHandler.loadItems(filename);
            items.clear();
            items.addAll(loadedItems);
            System.out.println("Items loaded from file successfully.");
        } catch (IOException e) {
            System.out.println("Error loading items from file: " + e.getMessage());
        }
    }

    public void searchByTitle(Scanner scanner) {
        System.out.print("Enter title to search for:\n");
        String searchTerm = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Item item : items) {
            if (item.getTitle().toLowerCase().contains(searchTerm)) {
                found = true;
                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println("ID: " + book.getId()
                            + ", Title: " + book.getTitle()
                            + ", Author: " + book.getAuthor());
                } else if (item instanceof DVD) {
                    DVD dvd = (DVD) item;
                    System.out.println("ID: " + dvd.getId()
                            + ", Title: " + dvd.getTitle()
                            + ", Duration: " + dvd.getDuration() + " minutes");
                }
            }
        }
        if (!found) {
            System.out.println("No items found with that title.");
        }
    }

    public void displayMenu() {
        System.out.println("=== Library Management System ===");
        System.out.println("1. Add new Book");
        System.out.println("2. Add new DVD");
        System.out.println("3. Remove item");
        System.out.println("4. List all items");
        System.out.println("5. Search by title");
        System.out.println("6. Save to file");
        System.out.println("7. Load from file");
        System.out.println("8. Exit");
        System.out.print("Enter your choice:\n");
    }   
}


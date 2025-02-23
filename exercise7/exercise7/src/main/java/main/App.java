package main;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            librarySystem.displayMenu();
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                continue;
            }

            switch (choice) {
                case 1:
                    librarySystem.addItem(1, scanner); 
                    break;
                case 2:
                    librarySystem.addItem(2, scanner); 
                    break;
                case 3:
                    librarySystem.removeItem(scanner);
                    break;
                case 4:
                    librarySystem.listAllItems();
                    break;
                case 5:
                    librarySystem.searchByTitle(scanner);
                    break;
                case 6:
                    librarySystem.saveToFile(scanner);
                    break;
                case 7:
                    librarySystem.loadFromFile(scanner);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}

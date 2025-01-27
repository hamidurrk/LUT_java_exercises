package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo(scanner);
        while (true) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("1")) {
                System.out.println("What species?");
                String userInputSpecies = scanner.next();
                System.out.println("Enter the name of the animal:");
                String userInputname = scanner.next();
                System.out.println("Enter the age of the animal:");
                String userInputage = scanner.next();
                scanner.nextLine();
                zoo.addAnimal(userInputSpecies, userInputname, userInputage);
            } else if (userInput.equals("2")) {
                zoo.listAnimals();
            } else if (userInput.equals("3")) {
                System.out.println("How many laps?");
                String input = scanner.nextLine();
                int laps;
                if (input.isEmpty()) {
                    laps = -1;
                } else {
                    try {
                        laps = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        laps = -1;
                    }
                }
                if (laps < 0) {
                    System.out.println("Wrong input value");
                    continue;
                } else {
                    zoo.animalsRun(laps);
                }
            } else if (userInput.equals("0")) {
                System.out.println("Thank you for using the program.");
                break;
            } else {
                System.out.println("Wrong input value");
            }
        }
        scanner.close();
    }
}

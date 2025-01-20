package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog();
        while (true) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                System.out.println("What does hedgehog say?");
                String userInputString = scanner.nextLine();
                if (userInputString.isEmpty()) {
                    hedgehog.speak();
                } else {
                    hedgehog.speak(userInputString);
                }
            } else if (userInput.equals("2")) {
                System.out.println("What is the name of the hedgehog:");
                String name = scanner.next();
                System.out.println("What is the age of the hedgehog:");
                try {
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    hedgehog = new Hedgehog(name, age);
                } catch (Exception e) {
                    System.out.println("Wrong input value");
                }
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
                    hedgehog.run(laps);
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

package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        int choice;
        do {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createNewVehicle(scanner, vehicles);
                    break;
                case 2:
                    listVehicles(vehicles);
                    break;
                case 3:
                    driveCars(vehicles);
                    break;
                case 4:
                    flyPlanes(vehicles);
                    break;
                case 5:
                    sailShips(vehicles);
                    break;
                case 0:
                    System.out.println("Thank you for using the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1) Create new vehicle, 2) List vehicles 3) Drive cars, 4) Fly planes, 5) Sail the ships, 0) End the program");
    }

    private static void createNewVehicle(Scanner scanner, List<Vehicle> vehicles) {
        System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
        int vehicleType = Integer.parseInt(scanner.nextLine());

        System.out.println("Who is the manufacturer?");
        String manufacturer = scanner.nextLine();

        System.out.println("What is the model of the vehicle?");
        String model = scanner.nextLine();

        System.out.println("What is the top speed?");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        Vehicle newVehicle = null;

        switch (vehicleType) {
            case 1:
                newVehicle = new Car(manufacturer, model, maxSpeed);
                break;
            case 2:
                newVehicle = new Plane(manufacturer, model, maxSpeed);
                break;
            case 3:
                newVehicle = new Ship(manufacturer, model, maxSpeed);
                break;
            default:
                System.out.println("Invalid vehicle type selected.");
        }

        if (newVehicle != null) {
            vehicles.add(newVehicle);
        }
    }

    private static void listVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles have been created yet.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v);               
            }
        }
    }

    private static void driveCars(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                ((Car) v).drive();
            }
        }
    }

    private static void flyPlanes(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            if (v instanceof Plane) {
                ((Plane) v).fly();
            }
        }
    }

    private static void sailShips(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            if (v instanceof Ship) {
                ((Ship) v).sail();
            }
        }
    }
}


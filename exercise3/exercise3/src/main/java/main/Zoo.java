package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    private String name;

    public Zoo(Scanner scanner) {
        System.out.println("Please, name the zoo:");
        this.name = scanner.nextLine();
    }

    public void addAnimal(String species, String name, String age) {
        Animal animal = new Animal(species, name, age);
        this.animals.add(animal);
    }
    
    public void listAnimals() {
        System.out.println(this.name + " contains the following animals:");
        for (Animal animal : this.animals) {
            System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " years");
        }
    }

    public void animalsRun(int laps) {
        for (Animal animal : this.animals) {
            animal.run(laps);
        }
    }
}

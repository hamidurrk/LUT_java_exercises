package main;

public class Animal {
    private String species;
    private String name;
    private String age;
    
    public Animal(String species, String name, String age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }
    
    public String getAge() {
        return this.age;
    }

    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }
}

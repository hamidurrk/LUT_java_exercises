package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String userInput) {
        System.out.println(this.name + ": " + userInput);
    }

    public void speak() {
        System.out.println("I am " + this.name + " and my age is " + this.age + ", but could you still give me input values?");
    }

    public void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }

}

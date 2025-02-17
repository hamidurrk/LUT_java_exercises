package main;

public class Plane extends Vehicle {

    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Plane", manufacturer, model, maxSpeed);
        this.engine = new Engine("Jet engine", 500);
    }

    public void fly() {
        System.out.println(manufacturer + " " + model + " is flying in the sky!");
    }
}


package main;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected Engine engine;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s\nMax Speed: %d km/h\nEngine: %s (%d HP) \n",
                type,
                manufacturer,
                model,
                maxSpeed,
                engine.getName(),
                engine.getPower()
        );
    }
}


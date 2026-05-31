import java.util.ArrayList;

public class Car {
    private String model;
    private int year;
    private ArrayList<Engine> engines; // now we have multiple engines

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.engines = new ArrayList<>();
    }

    // add an engine to the car
    public void addEngine(String engineType) {
        this.engines.add(new Engine(engineType));
    }

    public void display() {
        System.out.print(this.model + " " + this.year + " Engines: ");
        for (Engine e : engines) {
            System.out.print(e.type + " ");
        }
        System.out.println();
    }

    public void startAllEngines() {
        for (Engine e : engines) {
            e.start();
        }
        System.out.println("The " + this.model + " is running");
    }
}

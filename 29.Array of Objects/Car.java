public class Car {
    String make;
    String model;
    String color;
    int year;
    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    void drive(){
        System.out.println("You drive a " + year + " " + make + " " + model + " in " + color + " color.");
    }
}

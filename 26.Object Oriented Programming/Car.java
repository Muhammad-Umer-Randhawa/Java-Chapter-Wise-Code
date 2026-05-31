public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 60000.99;
    boolean isRunning = false;

    void start() { //<---methods
        isRunning = true;
        System.out.println("The car has started.");
    }
    void stop() { //<---methods
        isRunning = false;
        System.out.println("The car has stopped.");
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
        System.out.println("Car Price: " + myCar.price);
        System.out.println("Is the car running? " + myCar.isRunning);
        myCar.start();
        System.out.println("Is the car running? " + myCar.isRunning);
        myCar.stop();
        System.out.println("Is the car running? " + myCar.isRunning);   
    }
}

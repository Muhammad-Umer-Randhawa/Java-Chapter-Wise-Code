public class Main{
    public static void main(String[] args){
        //  Car car1 = new Car("Toyota", "Camry", "Red", 2020);

        //  Car car2 = new Car("Honda", "Accord", "Blue", 2018);

        //  Car car3 = new Car("Ford", "Mustang", "Black", 2021);

         // we can do this using an array of car objects;

        //  Car[] cars = {car1, car2, car3};
        //  for (Car car : cars) {
        //      car.drive();
        //  }

         // we can also create anonymous car objects like this;
        //  Car[] cars = {new Car("Nissan", "Altima", "White", 2019), //<---these are knows as anonymous objects.
        //                new Car("Chevrolet", "Malibu", "Silver", 2020)};

        //  for (Car car : cars) {
        //      car.drive();
        //  }

        // we can also do it like this;
        Car[] cars = new Car[2];
        cars[0] = new Car("Nissan", "Altima", "White", 2019);
        cars[1] = new Car("Chevrolet", "Malibu", "Silver", 2020);
        for (Car car : cars) {
            car.drive();
        }
    }
}
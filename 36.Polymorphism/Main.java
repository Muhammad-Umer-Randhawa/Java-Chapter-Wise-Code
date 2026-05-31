public class Main{
    public static void main(String[] args){
        //Polymorphism = "POLY" -> "MANY"
        //               "MORPH" -> "FORMS" or "SHAPES"
        //               Objects can identify as other objects.
        //               Objects can be treated as objects of a common superclass.
        //               It can also be achieved through interfaces.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicles[] vehicles = {car, bike, boat};
        for(Vehicles vehicle: vehicles){
            vehicle.go();
        }
    }   
}
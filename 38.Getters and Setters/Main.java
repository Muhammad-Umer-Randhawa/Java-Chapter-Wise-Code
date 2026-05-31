public class Main{
    public static void main(String[] args){

        //They help protect object data and add rules for accessing or modifying them.
        //GETTERS = Methods that make a field readable.
        //SETTERS = Methods that make a field writeable.

        Car car = new Car("Dodge", "Yellow" , 100000);

        car.setColor("Blue");
        car.setPrice(50000);


        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        //arrays ---> a collection of values of the same data type.
        //  *to make it easy think of it as a variable that can store more than 1 value*.
    
        String[] cars = {"Volvo", "BMW", "Ford", "Honda"};
        
        //indexing always starts from zero.
        
        //cars[0] = "Toyota";//to change a specific element in an array.
        //int numOfCars = cars.length;

        //System.out.println(cars[0]); //if we access the array just by its name we will get the reference of the array in the memory.
        //System.out.println(numOfCars);

        //we can print all the members of the array using a for loop;
        // for(int i = 0; i < cars.length; i++){
        //     System.out.println(cars[i]);
        // }
        //we can also do this using an enhanced for loop;
        // for(String car : cars){
        //     System.out.println(car);
        // }

        //we can also sort our array members using the Array class by importing it;
        // Arrays.sort(cars);
        // for(String car : cars){
        //     System.out.println(car);
        // }

        //to fill an array with a specific member;
        Arrays.fill(cars, "Toyota");
        for(String car : cars){
            System.out.println(car);
        }
    }
}
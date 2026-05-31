import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        // int target = 4;
        // boolean found = false;

        // for(int i = 0; i < numbers.length; i++){
        //     if(numbers[i] == target){
        //         found = true;
        //         break;
        //     }
        // }

        // if(found){
        //     System.out.println("Number " + target + " found in the array.");
        // }

        // if(!found){
        //     System.out.println("Number " + target + " not found in the array.");
        // }


        //for String type arrays:
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "banana", "cherry", "grape"};

        boolean found = false;
        String target;

        System.out.print("Enter the name of the fruit to search: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equalsIgnoreCase(target)){ //for strings we'll not use ==, we will use the .equals() method
                System.out.println("Fruit " + target + " found in the array.");
                found = true;
                break;
            }
        }

        scanner.close();

        if(!found){
            System.out.println("Fruit " + target + " not found in the array.");
        }
    }
}
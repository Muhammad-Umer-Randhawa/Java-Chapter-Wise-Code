import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //before assigning values to an array, we need to specify the size of the array.

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What # of foods do you want to enter? ");
        size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        foods = new String[size];

        for(int i = 0 ; i < foods.length; i++){
            System.out.print("Enter a Food: ");
            foods[i] = scanner.nextLine();
        }
        for(String food: foods){
            System.out.println(food);
        }
        scanner.close();

    }
}
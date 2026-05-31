import java.util.Scanner;
import java.util.ArrayList;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Enter the amount of numbers you want to enter: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < amount; i++){
            System.out.print("Enter a number: ");
            num.add(scanner.nextInt());
        }
        System.out.println(num);
        // for(Integer n : num){
        //     System.out.println(n);
        // }
        scanner.close();
    }
}

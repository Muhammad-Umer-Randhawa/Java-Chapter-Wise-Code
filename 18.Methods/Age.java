import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if(ageCheck(age)){
            System.out.println("You are eligible.");
        }
        else{
            System.out.println("You are not eligible.");
        }
        scanner.close();
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
       }
    }
}

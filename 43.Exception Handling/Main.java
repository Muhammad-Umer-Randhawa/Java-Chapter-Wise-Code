import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Exception = An event that disrupts the normal flow of a program
        //             (Division by zero, file not found, mismatch input type e.t.c)
        //             Surround any dangerous code with a try{} block.
        //             try{
        //                 // risky code
        //             }catch(Exception e){
        //                 // handle exception
        //             }

        // Scanner scanner = new Scanner(System.in); <---can also be inside the try block parenthesis.
        try(Scanner scanner = new Scanner(System.in)){ //  after this we dont need to close the scanner, it will be closed automatically.
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero!!!");
        }
        catch(Exception e){ // Catch any other exceptions. Always good to put at the end of all exceptions.
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{ // Do this if wanted...it always executes
            // System.out.println("Execution completed.");
        }
    }
}
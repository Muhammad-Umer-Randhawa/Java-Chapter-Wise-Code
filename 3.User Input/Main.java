import java.util.Scanner; //line to import the Scanner class from utility package
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //"Scanner" is the class and "scanner" is the object.

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        //nextLine() is a method in Scanner class that reads a line of text from the user.
        //above, if we only use next(), it will only read a single word (up to a space). nextLine() reads the entire line with spaces too!.

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Enter your gpa: ");
        // double gpa = scanner.nextDouble();

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("Hello, " + name + "!");
        // System.out.println("Your age is " + age);
        // System.out.println("Your GPA is " + gpa);
        // System.out.println("Are you a student? " + isStudent);

        //-------------------------------------------------------------------------------

        //Now there is an issue here, if we read an int or a double first then a string,
        // the input buffer reads the newline character left behind by nextInt(), nextDouble(),
        // or nextBoolean().
        // This causes the next call to nextLine() to read an empty string.

        //---------------------------------------------------------------------------
        
        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.println("You are " + age + " years old.");
        // System.out.println("Your name is " + name + ".");

        //----------------------------------------------------------------------------

        //its output is::==>
        // Enter your age: 21
        // Enter your name: You are 21 years old.
        // Your name is .
        //to correct the output, do the following:

        //----------------------------------------------------------------------------
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left after nextInt()
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("Your name is " + name + ".");
        scanner.close();
    }
}
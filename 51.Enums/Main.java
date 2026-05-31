import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that represents a fixed set of constants
        //         They improve code readability and maintainability.
        //         More efficient with switches when comparing Strings.

        //How to work with Enums:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();
        Day day = Day.valueOf(response);

        switch(day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It's a weekend");
        }
        scanner.close();
    }
}
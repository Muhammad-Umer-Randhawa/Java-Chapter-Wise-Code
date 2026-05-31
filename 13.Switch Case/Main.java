import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = scanner.nextLine();
        switch(day){

            //-> is an arrow operator

            // case "Monday" -> System.out.println("It is a weekday");
            // case "Tuesday" -> System.out.println("It is a weekday");
            // case "Wednesday" -> System.out.println("It is a weekday");
            // case "Thursday" -> System.out.println("It is a weekday");
            // case "Friday" -> System.out.println("It is a weekday");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println("Invalid day");
        }
        scanner.close();
        //if one or more cases have the same code running, we can comma seperate them.
    }
}
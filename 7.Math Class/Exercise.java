import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        //Find Hypotenuse:
        
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        scanner.close();
        System.out.println("Hypotenuse: " + c);
    }
}

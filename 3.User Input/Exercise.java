import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){

        double length = 0.0;
        double width = 0.0;
        double area = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
        area = length * width;
        System.out.println("The area of the rectangle is: " + area + " cm²");
        scanner.close();
    }
}
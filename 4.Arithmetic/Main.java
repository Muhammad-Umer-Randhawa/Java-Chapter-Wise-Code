public class Main {
    public static void main(String[] args) {
        //ARITHMETIC OPERATIONS
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //Augmented assignment operators:
        int x = 10;
        int y = 3;
        x += y;
        // x -= y;
        // x *= y;
        // x /= y;
        // x %= y;
        System.out.println("Augmented Addition: " + x);
        System.out.println("Augmented Subtraction: " + x);
        System.out.println("Augmented Multiplication: " + x);
        System.out.println("Augmented Division: " + x);
        System.out.println("Augmented Modulus: " + x);

        //Increment and Decrement Operators:
        int z = 5;
        System.out.println("Initial Value: " + z);
        z++; //post increment
        System.out.println("After Increment: " + z);
        z--; //post decrement
        System.out.println("After Decrement: " + z);
        ++z; //pre increment
        System.out.println("After Pre-Increment: " + z);
        --z; //pre decrement
        System.out.println("After Pre-Decrement: " + z);
    }
}
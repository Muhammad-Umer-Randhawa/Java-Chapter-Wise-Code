public class Main{
    public static void main(String[] args) {
        // Ternary operator returns 1 of 2 values depending on the condition if its true or false.
        // (condition) ? ifTrue : ifFalse;
        //works like if-else.
        int a = 5, b = 10;
        int max = (a > b) ? a : b;
        System.out.println("Max value is: " + max);
    }
}
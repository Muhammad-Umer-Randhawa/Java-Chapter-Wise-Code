public class Main{
    public static void main(String[] args){
        String name = "John";
        int age = 25;
        double height = 161.7;
        boolean isEmployed = true;

        System.out.printf("Name: %s\n", name);

        //If entering a variable, after % sign enter the data type of that variable by inserting the first letter of the data type of the variable in lowercase.
        //%[specifier-character] is called format specifier.
        //Separate each variable with a comma.

        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %.1f\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        //We can also add multiple specifiers in one line of code like this:
        System.out.printf("%s is %d years old, his height is %.1f cm and %b he is Employed", name, age, height, isEmployed);
    }
}
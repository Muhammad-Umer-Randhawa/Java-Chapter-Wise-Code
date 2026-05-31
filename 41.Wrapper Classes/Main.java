public class Main{
    public static void main(String[] args) {
        //Wrapper Classes = Allow primitive values (int, char, double, boolean)
        //                  to be used as objects. "Wrap them in an object".
        //                  Generally dont wrap  primitives unless you need an object.
        //                  Allows use of collections framework and static utility methods.
        //                  All wrapper classes are immutable (cannot be changed).
        //                  The modern approach is using a technique called autoboxing.

        // int a = 10;
        // Instead of declaring 'a' this way, do it like this(only if you want to make an object)

        //Autoboxing:
        // Integer a = 123;
        // Double b = 456.78;
        // Character c = 'Z';
        // Boolean d = true;   

        //Unboxing: Taking a primitive that is wrapped in an object and unboxing it and setting it back to its primitive:
        // int x = a;
        // double y = b;
        // char z = c;
        // boolean w = d;

        //If you ever need to convert a primitive data type into a String, there is a toString() method of these Wrapper classes.
        // String a = Integer.toString(123);
        // String b = Double.toString(456.78);
        // String c = Character.toString('Z');
        // String d = Boolean.toString(true);

        // String x = a + "\n" + b + "\n" + c + "\n" + d;
        // System.out.println(x);

        //On the other hand to convert a string back to a primitive data type, you can use the parse methods of these Wrapper classes.
        // int a = Integer.parseInt("123");
        // double b = Double.parseDouble("456.78");
        // char c = Character.toChars(Integer.parseInt("90"))[0];
        // boolean d = Boolean.parseBoolean("true");

        //Some other methods;
        char letter = 'A';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
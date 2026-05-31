public class Main{
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface or method.
        //            that is compatible with different data types.
        //            <T> is a placeholder for the actual type. (type parameter).
        //            <T> can be replaced with any valid type (e.g., Integer, String).
        //            <String> type argument(specifies the type).
        //            for e.g., ArrayList<String> --> here in the ArrayList class, inside the
        //            diamond operator <>, the E or T (if we look inside the ArrayList class)
        //            are the parameters, they can take any wrapper class as arguments.
        //            Integer, String, Boolean e.t.c. T is like a generic parameter, 
        //            which means anything can replace it as argument when using the class
        //            or making its objects.
        //            We use <T> when we dont know what the type is going to be, or the type
        //            depends on the user. So we just use T giving java a message that it is
        //            a generic type, it can be replaced type as the program or the user wishes
        //            to.
        //            We can also use 2 generic type parameters, <T, U>, can be more like <T, U, V>.

        // Box<String> stringBox = new Box<>();
        // stringBox.setItem("Hello Generics");
        // System.out.println(stringBox.getItem());

        // Box<Integer> integerBox = new Box<>();
        // integerBox.setItem(123);
        // System.out.println(integerBox.getItem()); 

        Product<String, Double> product = new Product<>("Laptop", 799.99);
        System.out.println("Product: " + product.getItem());
        System.out.println("Price: " + product.getPrice());
    }
}
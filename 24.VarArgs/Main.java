public class Main{
    public static void main(String[] args) {

        // varargs = allow a method to accept varying # of arguments
        //           makes methods flexible, no need to overload methods.
        //           java will pack the arguments into an array.
        //           ...(ellipses)

        System.out.println(add(1, 2, 3, 4, 5));

    }
    static int add(int... numbers){
        int sum=0;
        for(int n: numbers){
            sum +=n;
        }
        return sum;
    }
}
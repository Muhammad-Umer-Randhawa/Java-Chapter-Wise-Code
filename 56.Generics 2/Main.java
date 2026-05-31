import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(5);
        integerPrinter.print();
        // shout("Hasssssaaaaaaaaan");
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList);
    
    
    }
    //we can also have generic methods
    // public static <T> void shout(T thing){
    //     System.out.println(thing + "!!!!!!");
    // }

    public static void printList(List<?> myList){
        System.out.println();
    }

}

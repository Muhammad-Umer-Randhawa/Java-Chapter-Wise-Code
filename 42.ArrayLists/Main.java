import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change.
        // Syntax: ArrayList<DataType> arrayListName = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); // add to the end
        list.add(2);
        list.add(1);

        // list.remove(0); // remove value at index 0
        // list.set(0, 5); // change value at index 0
        // System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.size()); // size of the ArrayList
        Collections.sort(list);
        System.out.println(list);

        //an enhanced for loop can also be used to loop through all the elements of the arraylist:
        for (int num : list) {
            System.out.println(num);
        }

    }
    
}

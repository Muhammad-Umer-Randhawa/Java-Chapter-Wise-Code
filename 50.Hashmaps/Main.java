import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs.
        //           It allows for fast retrieval of values based on their keys.
        //           HashMap is part of the Java Collections Framework.
        //           Does not maintain the order of elements (like ArrayLists).
        //           HashMaps are used when:
        //          >You have one unique thing
        //          >That leads to one related thing
        //          >And you want to find it quickly
        //           HashMaps are commonly used for:
        //          >Lookups
        //          >Counting
        //          >Mapping IDs to data
        //          >Real-world pair relationships
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();
        map.put("Apple", 0.99);
        map.put("Banana", 0.59);
        map.put("Cherry", 2.99);
        // map.remove("Apple");
        
        // System.out.println(map);

        // Accessing values
        // System.out.println("Price of Apple: " + map.get("Apple"));
        // System.out.println("Price of Banana: " + map.get("Banana"));
        // System.out.println("Price of Cherry: " + map.get("Cherry"));
        
        //contains:
        // System.out.println(map.containsKey("Apple")); // true
        // System.out.println(map.containsKey("Coconut")); // false
        // System.out.println(map.containsValue(0.99)); // true
        
        //size
        // System.out.println(map.size());

        for(String key: map.keySet()) { //keySet() returns all the keys, they are itterable
            System.out.println(key + ": " + map.get(key));
        }
    }
}

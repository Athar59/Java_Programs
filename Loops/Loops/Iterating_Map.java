
/*
Iterating over maps (HashMap, TreeMap)

Using loops to iterate over keys and values ​​in maps.

In this example, we iterate over a HashMap to print its keys and values.
*/
import java.util.HashMap;
import java.util.Map;

public class Iterating_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


//OUTPUT******************

// Key: Bob, Value: 30
// Key: Alice, Value: 25
// Key: Charlie, Value: 35
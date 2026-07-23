import java.util.HashMap;
import java.util.Map;
public class hashmapmethods {
    public static void main(String[] args) {
        // Create a HashMapS
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Grapes");

        // Displaying the HashMap
        System.out.println("HashMap: " + map);
        // Accessing elements by key
        System.out.println("Value for key 2: " + map.get(2));
        // Accessing elements by key that does not exist
        System.out.println("Value for key 5: " + map.get(5)); 
        // Updating an element by key
        map.put(2, "Blueberry");    

        // Checking if a key exists
        System.out.println("Contains key 2: " + map.containsKey(2));

        // Checking if a value exists
        System.out.println("Contains value 'Banana': " + map.containsValue("Banana"));

        // Removing an element by key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Checking the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing HashMap: " + map);

        // Checking if the HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());
        // array of elements to hashmap
        String[] fruits = {"Mango", "Pineapple", "Strawberry"};
        HashMap<Integer, String> newMap = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            newMap.put(i, fruits[i]);
        }
        System.out.println("New HashMap: " + newMap);
        // Iterating through the HashMap
        System.out.print("Iterating through HashMap: ");    
    for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            System.out.print("Key: " + entry.getKey() + ", Value: " + entry.getValue() + "; ");
        }

    }
    
}

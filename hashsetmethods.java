import java.util.HashSet;
public class hashsetmethods {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Orange");
        System.out.println("After removing 'Orange': " + set);
        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing HashSet: " + set);
        // Checking if the HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());
        // array of elements to hashset
        String[] fruits = {"Mango", "Pineapple", "Strawberry"};
        HashSet<String> newSet = new HashSet<>();
        for (String fruit : fruits) {
            newSet.add(fruit);
        }
        System.out.println("New HashSet: " + newSet);

        // Iterating through the HashSet
        System.out.print("Iterating through HashSet: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
    }
}
import java.util.*;
public class findminno {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        PriorityQueue<Integer> a = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }

        System.out.println("Minimum element in the heap: " + a.peek());

    }
}

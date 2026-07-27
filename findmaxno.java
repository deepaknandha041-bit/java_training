import java.util.*;
public class findmaxno {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }

        System.out.println("Maximum element in the heap: " + a.peek());

    }
}

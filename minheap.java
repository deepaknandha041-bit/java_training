import java.util.*;
public class minheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min-heap
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(3);

        System.out.println("Elements in the min-heap (in ascending order):");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }

    
}

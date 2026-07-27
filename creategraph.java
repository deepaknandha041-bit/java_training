import java.util.ArrayList;

public class creategraph {
    public static void main(String[] args) {

        int v = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(4);

        // Print the graph
        for (int i = 0; i < v; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}
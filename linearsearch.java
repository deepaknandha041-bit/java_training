public class linearsearch {
    public static void main(String[] args) {

        int[] arr = {12, 25, 35, 45, 55};

        int key = 35;
        int found = 0;
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = 1;
                position = i + 1;
            }
        }

        if (found == 1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
             
    
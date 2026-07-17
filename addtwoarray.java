public class addtwoarray {
    public static void main(String[] args) {

        int[] arr = {10, 15, 22, 37, 48};

        System.out.println("add two for each:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]+2);
            }
        }
    }
}
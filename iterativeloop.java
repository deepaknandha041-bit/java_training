public class iterativeloop {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5,8,9,56};
        number[0] = 1000;

        System.out.println("For Loop");

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
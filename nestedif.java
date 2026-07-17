public class nestedif {
    public static void main(String[] args) {

        int age = 25;

        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You are above 18 but below 21.");
            }
        } else {
            System.out.println("You are not eligible to drive.");
        }
    }
}
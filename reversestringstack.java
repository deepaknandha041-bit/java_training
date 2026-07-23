import java.util.Stack;

public class reversestringstack {
    public static void main(String[] args) {

        String str = "Hello";
        Stack<Character> stack = new Stack<>();

       
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

      
        System.out.print("Reversed String: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
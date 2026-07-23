import java.util.HashMap;
import java.util.Map;
public class frequencycount {
    public static void main(String[] args){
        String input = "aabbbccde";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequency of each character:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() +" "+ entry.getValue());
        }
    }

} 
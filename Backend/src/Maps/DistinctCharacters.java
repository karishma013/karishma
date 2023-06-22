package Backend.src.Maps;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main(String[] args) {
        String inputString = "test string";

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (c != ' ') {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
        System.out.println();
    }
}

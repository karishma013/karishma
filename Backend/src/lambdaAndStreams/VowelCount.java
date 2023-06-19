package Backend.src.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "streams", "lambda");

        strings.stream()
                .filter(s -> s.matches(".*[aeiou].*"))  // Filter strings containing vowels
                .forEach(s -> System.out.println("String: " + s + ", Vowel Count: " + countVowels(s)));
    }

    private static int countVowels(String str) {
        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOU".contains(String.valueOf(c)))  // Filter vowels
                .count();
    }
}
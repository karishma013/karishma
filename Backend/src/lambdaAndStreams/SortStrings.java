package Backend.src.lambdaAndStreams;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = { "streams", "sorting", "strings","java"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))  // Sort based on last character in descending order
                .forEach(System.out::println);
    }
}

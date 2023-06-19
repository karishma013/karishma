package Backend.src.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class capitalize {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "Backend", "Advanced", "concepts", "lambda");

        List<String> capitalizedAndSorted = strings.stream()
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .collect(Collectors.toList());

        capitalizedAndSorted.forEach(System.out::println);
    }
}
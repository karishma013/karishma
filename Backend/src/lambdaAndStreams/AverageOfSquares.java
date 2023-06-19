package Backend.src.lambdaAndStreams;

import java.util.Arrays;

public class AverageOfSquares {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double averageOfOddSquares = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .average()
                .orElse(0.0);

        System.out.println("Average of squares of odd numbers: " + averageOfOddSquares);
    }
}

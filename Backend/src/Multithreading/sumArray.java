package Backend.src.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sumArray {

    public static int sumArray(int[] array) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer>[] futures = new Future[5];
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            futures[i] = executorService.submit(new Callable<Integer>() {

                public Integer call() throws Exception {
                    int sum = 0;
                    for (int j = finalI * 20; j < (finalI + 1) * 20; j++) {
                        sum += array[j];
                    }

                    return sum;

                }
            });
        }

        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }

        int sum = sumArray(array);

        System.out.println("The sum is " + sum);
    }
}
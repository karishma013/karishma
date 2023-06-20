package Backend.src.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("list", "set", "queue", "stack"));
        System.out.println("for loop: ");
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }
        System.out.println("==========================");
        System.out.println("enhanced for loop: ");
        for (String str : obj) {
            System.out.println(str);
        }
        System.out.println("==========================");
        System.out.println("iterator: ");
        Iterator<String> it = obj.iterator();
        {
            while (it.hasNext()) {
                System.out.println(it.next() + " ");

            }
            System.out.println("==========================");
            System.out.println("for each: ");

            Stream.of(obj).forEach(s -> System.out.println(s+" "));
            System.out.println("==========================");
            System.out.println(" Parallel: ");

            Stream.of(obj).parallel().forEach(System.out::println);
        }
    }
}
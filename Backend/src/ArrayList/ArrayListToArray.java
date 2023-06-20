package Backend.src.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Array", "list", "vector", "set", "queue", "stack"));
        String array[]=obj.toArray(new String[obj.size()]);
        for(String str:array){
            System.out.println(str);
        }
    }
}

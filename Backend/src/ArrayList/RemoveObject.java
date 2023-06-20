package Backend.src.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveObject {
    public static void main(String[] args){
        ArrayList<Integer> obj=new ArrayList<>(Arrays.asList());
        obj.add(10);
        obj.add(15);
        obj.add(5);
        obj.add(3);
        obj.add(7);
        obj.add(0);
        System.out.println("Before  :"+obj );
        obj.remove(obj.size()-1);
        System.out.println("After  :"+obj );
    }
}

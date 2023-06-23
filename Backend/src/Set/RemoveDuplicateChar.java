package Backend.src.Set;

import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
   Set<Character> ch=new HashSet<>();
          String str = "collections";
        for (char c : str.toCharArray()){
            ch.add(c);
          }
        System.out.println(ch);

    }
}

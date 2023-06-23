package Backend.src.Set;

import java.util.*;
import java.util.stream.Stream;

public class IterateHashSet {
    public static void main(String[] args){
        Set<String> s=new HashSet<>();
        s.add("collections");
        s.add("interfaces");
        s.add("list");
        s.add("queue");
        s.add("set");
        s.add("HashSet");
        s.add("treeSet");
        s.add("entrySet");
        s.add("keySet");
        s.add("iterator");

        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=============================================");
        for(String s1:s){
            System.out.println(s1);
        }
        System.out.println("====================================================");
        Stream.of(s).forEach(f -> System.out.println(f+" "));


    }
}

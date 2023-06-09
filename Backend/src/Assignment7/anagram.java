package Backend.src.Assignment7;

import java.util.Arrays;

public class anagram {
    public static void main (String []args){
        String str1="a gentleman";
        String str2="elegant man";
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] array1=str1.toCharArray();
            char[] array2=str2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean result=Arrays.equals(array1,array2);
            if(result) {
                System.out.println(" anagram Strings ");
            }
            else {
                System.out.println(" not anagram Strings");
            }
        }
        else {
            System.out.println("  Strings  are not anagram");
        }
    }
}

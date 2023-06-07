package Backend.src.Assignment6;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter elements you want to store");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []array = new int[10];
        System.out.println("enter array elements");
        for(int i=0;i<=n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("reverse of an array:");
        for(int i=n;i>=0;i--){
          System.out.println(array[i]);
        }


    }
}

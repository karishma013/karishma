package Backend.src.Assignment5;

import java.util.Scanner;

public class age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
       while(age<150) {

           if (age < 13) {
               System.out.println("you are a kid");
           } else if (age > 19) {
               System.out.println("you are an Adult");
           } else System.out.println("you are teen");
       }
        System.out.println("you are not a human");
      }
}

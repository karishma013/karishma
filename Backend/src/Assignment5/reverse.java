package Backend.src.Assignment5;


import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int r;
        System.out.print("reverse :");
        while (n!=0) {
            rem = n % 10;
            System.out.print(rem);
            //rev = rev * 10 + rem;
            n = n / 10;

        }

    }
}

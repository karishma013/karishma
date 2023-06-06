package Backend.src.Assignment5;

public class fibonacci {
    public static void main(String[]args){
        int n=10,f=0,b=1,fib;
        for(int i=0;i<n;i++){
            System.out.print(f+" ");
            fib=f+b;
            b=f;
            f=fib;


        }
    }
}

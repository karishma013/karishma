package Backend.src.Assignment6;
import java.util.Scanner;
public class rotateArray {
    public static void main(String[] args){
        int array[]=new int[] {8,6,31,53,1,7};
        int n;
        System.out.println("enter the position");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i<array.length;i++){
          System.out.print(array[i]+" ");
        }
        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }

    }
}

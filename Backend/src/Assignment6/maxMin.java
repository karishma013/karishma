package Backend.src.Assignment6;

public class maxMin {
    public static void main(String[] args){
        int array[]=new int[] {8,6,31,53,1};
        int min=array[0] ,max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max){
                 max=array[i];
            }else if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("largest num: "+max);
        System.out.println("smallest number: "+min);
    }
}

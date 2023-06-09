package Backend.src.Assignment7;

public class vowels {
    public static void main(String []args){
        String str="checking vowels in string";
        str=str.toLowerCase();
        int vCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
              vCount++;
            }
        }
        System.out.println("number of vowels : "+vCount);
    }
}

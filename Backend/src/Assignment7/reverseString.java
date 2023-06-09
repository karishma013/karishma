package Backend.src.Assignment7;

public class reverseString {
    public static void main(String[] args) {
        String str = "Java J2EE Reverse Me";
        String revStr = "";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            for(int j=word.length()-1;j>=0;j--){
             revWord=revWord+word.charAt(j);
             }
            revStr=revStr+revWord+" ";
          }
            System.out.println("reversed String : "+revStr);

        }
    }


package Backend.src.Assignment7;

public class rotationOfString {
    public static void main(String[]args){
        String str1="JavaJ2eeStrutsHibernate";
        String str2="StrutsHibernateJavaJ2ee";
        String temp=str1+str1;
        if(str1.length()==str2.length()){
            if(temp.contains(str2)){
                System.out.println("True");
            }
        }else{
            System.out.println("false");
        }
    }
}

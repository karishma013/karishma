
public class classpare implements interface1,interface2 {

	public int method1(int n1,int n2) {
		System.out.println( "interface1 "+n1+","+n2);
		return n1+n2;
		}
	public String method2(String s){
		 
		return s;
	}
	public int mehtod21(int n3,int n4) {
		System.out.println( "interface2 "+(n3-n4));
		return n3-n4;
		}
	public String method22(String s) {
		return s;
	}
	//abstract public String method23(String s);
	
	public static void main(String[] args){
	classpare obj = new classpare();
		obj.method1(5,6);
		 //obj.method2("from interface1");
		 obj.mehtod21(7,8);
		 //obj.method22("from interface2");
		
		 
		
 
	}
}

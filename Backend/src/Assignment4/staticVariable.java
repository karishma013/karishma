package Backend.src.Assignment4;

public class staticVariable {
	static int n;
	int m;
	static int display() {
		return n;		
		}
	static {
		n=45;
		System.out.println("static block ");
	}
	 public static void main(String args[]){
		 System.out.println(display());
		 
		 
}
}


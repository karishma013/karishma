
final public class finalClass {
	final int n=10;
  public int finalMethod() {
	  System.out.println("final method "+n);
	  return n;
	    }
  public static void main(String[] args) {
	  finalClass obj= new finalClass();
	  obj.finalMethod();
  }
}



public class instanceChild extends instanceParent{
	public int n2;
	
	public instanceChild(int n1,int n2) {
		super.n1=n1;
		this.n2=n2;	
	}
	
	public instanceChild(int n2){
		this.n2=n2;
		//System.out.println("overloaded constructor variable"+(n2));
	}
	
	public static void main(String args) {
		instanceChild obj= new instanceChild(9,8);
		System.out.println("initialised instance variables"+obj.n1+","+obj.n2);			 
	}
}
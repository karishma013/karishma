package Backend.src;

public class CsDepartment extends Department{

		
		public int DepartementSize(int n) {
			return n;					
		}
		public static void main(String[] args) {
			Department dep=new CsDepartment();
			dep.show();
			System.out.println(+dep.DepartementSize(10) );
			
			
}
}
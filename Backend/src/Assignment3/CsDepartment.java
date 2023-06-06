package Backend.src.Assignment3;

public class CsDepartment extends Department {

		
		public int departmentSize(int n) {

			return n;
		}
		public static void main(String[] args) {
			Department dep=new CsDepartment();
			dep.show();
			System.out.println(+((CsDepartment) dep).departmentSize(10) );
			
			
}
}
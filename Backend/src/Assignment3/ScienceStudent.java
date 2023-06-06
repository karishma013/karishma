package Backend.src.Assignment3;

public class ScienceStudent extends School {
	public void student(){
		System.out.println( "student from the Science class.");
	}
		public static void main(String[] args){
			School s= new School();
			School science= new ScienceStudent();
			School bio= new BioStudent();
			bio.student();
			s.student();
			science.student();
			
		}
	}


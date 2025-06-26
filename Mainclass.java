package corejava.d2;

public class Mainclass {
	public static void main(String args[]) {
		Student s1=new Student();
		s1.display("Rohit", 2,78);
		if(s1.ispass()) {
			System.out.println("student pass");
		}else {
			System.out.println("student fail");
		}
		
		Student s2=new Student();
		s2.display("pranav", 3,78);
		if(s2.ispass()) {
			System.out.println("student pass");
		}else {
			System.out.println("student fail");
		}
		
		Student s3=new Student();
		s3.display("suraj", 2,90);
		if(s3.ispass()) {
			System.out.println("student pass");
		}else {
			System.out.println("student fail");
		}
	}

}

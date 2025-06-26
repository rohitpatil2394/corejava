package corejava.d2;

public class Student {
	String name;
	int roll;
	int marks;
	
	public  void display(String name, int roll, int marks) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
		System.out.println("student name:"+this.name);
		System.out.println("student roll no:"+this.roll);
		System.out.println("student marks:"+this.marks);
		
	}
	public  boolean ispass() {
		boolean ispasss=true;
		if(marks>=40) {
			return true;
		}else {
			return false;
		}

	}

}

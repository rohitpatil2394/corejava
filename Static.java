package corejava.d1;

public class Static {
	void m1() {
		System.out.println("this is non static");
		
	}
	static void m2() {
		System.out.println("static method");
		
	}
	public static void main(String args[]) {
		Static s1=new Static();
		s1.m1();
		m2();
		}
}

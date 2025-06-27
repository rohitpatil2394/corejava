package oopsjava.d4;


public class methodoverloading {
	
	public void sum(int a) {
		System.out.println(a+a);
	}
	public void sum(double a) {
		System.out.println(a+a);
	}
	public static void main(String args[]) {
		methodoverloading m1= new methodoverloading();
		m1.sum(2);
		m1.sum(2.3);
	}
}

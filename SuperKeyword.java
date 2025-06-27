package oopsjava.d4;


class A1{
	int a=10;
}

class B1 extends A1{
	int a=20;
	void m1() {
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class SuperKeyword {
	public static void main(String args[]) {
		B1 b=new B1();
		b.m1();
	}

}

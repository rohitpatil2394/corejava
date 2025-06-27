package oopsjava.d4;

class X {
	void m1() {
		System.out.println("This is a super class");
		
	}

}
 class Y extends X{
		void m2() {
			System.out.println("This is a m2 method");
				}
	}
 public class SingleInheritance {
		public static void main(String args[]) {
			Y b= new Y();
			b.m2();
			b.m1();
		}
	}
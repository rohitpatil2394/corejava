package corejava.d3;

//public class Finalkeyword {
//	//public static void main(String args[]) {
//		final int a=10;
//		System.out.println("a:"+a);
//		
//		int a=20;
//		System.out.println("a:"+a);
//		
//	}
//
//}

 class B {
	void m1() {
		System.out.println("normal method");
	}
	final void m2() {
		System.out.println("final method");
	}
	
}
 
 class C extends B{
	
	void m1() {
		System.out.println("method m1");
	}
}
	public class Finalkeyword{
	public static void main(String args[]) {
		C c= new C();
		c.m1();
		c.m2();
	}
	
}
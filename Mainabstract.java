package oopsjava.d4;

abstract class Programming{
	public abstract void develope();
	void m1() {
		System.out.println("noraml method");
	}
	Programming(){
		System.out.println("high level programming language");
	}
}

class java extends Programming{

	@Override
	public void develope() {
		System.out.println("james reschers");
	}		
	}
class python extends Programming{
	@Override
	public void develope() {
		System.out.println();
		
	}
}

public class Mainabstract {
	public static void main(String args[]) {
Programming p=new java();
p.develope();
p.m1();

Programming p2=new python();
p2.develope();
p2.m1();

}}

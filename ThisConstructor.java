package oopsjava.d4;

public class ThisConstructor {
	public static void main(String args[]) {
	Ay a=new Ay();
}
}
class Ay{
	Ay(){
		this(10);
		System.out.println("default");
	}
	Ay(int a){
		System.out.println("parameterized constructor");
		System.out.println(a);
	}
}
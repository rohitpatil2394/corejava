package corejava.d1;

public class Staticblock {
	static {
		System.out.println("static block");
	}
	public static void main(String args[]) {
		System.out.println("this is main method");
		Staticblock s1=new Staticblock();	
	}
	
	static {
		System.out.println("static block");
	}
	
	//non-static method
	{
		System.out.println("non static block");
	}
	}

package oopsjava.d4;

public class excepationn {
	public static void main(String args[]) {
		System.out.println("palatominds");
		int a=12;
		try {
		System.out.println(a/0);
	}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("divide by zero not allowed");
		}
		System.out.println(30);
	}

}

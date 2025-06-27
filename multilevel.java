package oopsjava.d4;

class Aa{
	void displayA() {
		System.out.println("I am a class A");
	}
}

class Bb extends Aa{
	void displayB() {
		System.out.println("I am a class B");
	}
}

class Cc extends Bb{
	void dispalyC() {
		System.out.println("I am a class C");
	}
}
public class multilevel {
	public static void main(String args[]) {
		Cc obj=new Cc();
		obj.displayA();
		obj.displayB();
		obj.dispalyC();
	}
}

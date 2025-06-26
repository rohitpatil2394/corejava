package corejava.d1;

public class method {
	public static void main(String args[]) {
		
		System.out.println("addition of two number :"+add(45,89));
		method m1=new method();
		m1.sub(56, 9);
		
		System.out.println(multiply(4,5));
		System.out.println(multiply(4.3f, 5.8f));
		
	}
	public static int add(int a, int b){
		return a+b;
	}
	void sub(int a, int b) {
		int result=a-b;
		System.out.println("the result is: "+result);
	}



//method overloading
public static int multiply(int a, int b) {
	return a*b;
}
public static float multiply(float a , float b) {
	return a*b;
}
}

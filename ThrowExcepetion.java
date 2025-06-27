package oopsjava.d4;

public class ThrowExcepetion {
	
	public void m1(int a , int b) {
		if(b==0) {
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
	}
public static void main(String args[]) {
	ThrowExcepetion e=new ThrowExcepetion();
	e.m1(2, 0);
}
}

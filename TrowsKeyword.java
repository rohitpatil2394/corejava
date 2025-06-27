package oopsjava.d4;


public class TrowsKeyword {
	public void m1(int a, int b)throws ArithmeticException{
		System.out.println(a/b);
		
	}
	
	public static void main(String args[]) {
		TrowsKeyword t=new TrowsKeyword();
		try {
			t.m1(7, 0);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

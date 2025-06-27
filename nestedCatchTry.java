package oopsjava.d4;

public class nestedCatchTry {
	public static void main(String args[]) {
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println(e);
			try {
				int a[]= {10,20};
			System.out.println(a[2]);
			}catch(ArithmeticException e1) {
			 System.out.println(e1);
			}				
		}
		
	}
	}



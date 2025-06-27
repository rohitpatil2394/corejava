package oopsjava.d4;

public class finallyBlock {
	public static void main(String args[]) {
		String s=null;
		try {
		System.out.println(s.length());
		try {
			int a[]= {10,20};
			System.out.println(a[2]);
			}catch(ArithmeticException e) {
			 System.out.println(e);
			}				
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("fanally block");
		}
	}
	}


package oopsjava.d4;

public class exceptio2 {
	public static void main(String args[]) {
		String s= null;
		
		try {
			System.out.println(s.length());
			int a[]= {10,20};
			System.out.println(a[2]);
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handle");
		}

		System.out.println("done");
}
}
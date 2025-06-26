package corejava.d2;

public class factorial {
	public static void main(String args[]) {
		int n=5;
		int fact=1;
		System.out.println("factorial of"+n+" is:" );
		for(int i=1; i<n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

}

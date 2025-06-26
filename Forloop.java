package corejava.d2;

public class Forloop {
	public static void main(String args[]) {
		int n = 10;
		int first = 0;
		int secound = 1;

		System.out.println("first " + n + " terms of fibonacci series:");
		System.out.print(first + " ");
		for (int i = 1; i < n; i++) {
			System.out.print(secound + " ");
			int next = first + secound;
			first = secound;
			secound = next;

		}
	}
}

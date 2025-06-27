package oopsjava.d4;

public class ThisKey {
	public static void main(String args[]) {
		By b=new By();
		b.m1(10);
			b.m2();
		}
}

class By{
	
	int i;
	void m1(int i) {
		this.i=i;
	}
	void m2() {
		System.out.println(i);
	}

}
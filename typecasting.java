package corejava.d1;

public class typecasting {
	public static void main(String args[]) {
		int a=78;
		double b=a;
		System.out.println(a);
		System.out.println(b);
		
		double c=34.98;
		int d= (int)c;
		System.out.println(c);
		System.out.println(d);
		
		char e='A';
		int ascii=e;
		char f= (char) (ascii+1);
		System.out.println("ascii of  A:"+ascii);
		System.out.println("next char:"+f);
		
	}

}

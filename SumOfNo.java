package corejava.d2;

public class SumOfNo {
	public static void main(String args[]) {

		int n=123;
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of 123 is:"+sum);
		
		
		int b=123;
		int product=1;
		while(b>0) {
			product=product*b%10;
			b=b/10;
	}
		System.out.println("product of 123 is:"+product);
		
		int c=123;
		
		int reverse=0;
		while(c>0) {
			int lastdigit=c%10;
			reverse=(reverse*10)+lastdigit;
			c=c/10;
		}
		System.out.println("reverse of 123  is:"+reverse);
		
		
		
		int x=123;
		int sumsqu=0;	
		while(x>0) {			
		sumsqu=sumsqu+(x%10)*(x%10);		
			x=x/10;
		}
		System.out.println("sum of squre 123 is:"+sumsqu);
		
	}

}

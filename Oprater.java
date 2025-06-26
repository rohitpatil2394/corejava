package corejava.d2;

public class Oprater {
public static void main(String args[]) {
	//Arithematic oprater
	int a=10;
	int b=20;
	int c=10;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	
	// relational operater
	
		System.out.println("relatinal op :"+(a<b));			
	
		System.out.println("relatinal op :"+(b>a));
	
		System.out.println("relatinal op :"+(b!=a));
	
		System.out.println("relatinal op :"+(a==c));

		System.out.println("relatinal op :"+(a<=b));
	
		System.out.println("relatinal op :"+(a>=b));	
	
		
	//Assignment operater
	
	int d=10;
	d+=5;
	System.out.println("value of d:"+d);
	
	int e=20;
	e-=2;
	System.out.println("value of e: "+e);
	
	e*=3;
	System.out.println("value of e:"+e);
	
	e/=2;
	System.out.println("value of  e:"+e);
	
	
// logical operater
	
	System.out.println("logical AND:"+((d<e)&&(e>d)));
	System.out.println("logical OR:"+((d<e)||(e==d)));
	System.out.println("logical NOT:"+!(d<e));
	
	
// Bitwise oprator
	int x=8;
	int y=10;
	System.out.println("Binary AND: "+(x & y));
	System.out.println("Binary OR :"+(x | y));
	System.out.println("Binary XOR:"+(x ^ y));
	System.out.println("Binary one's complement :"+(~x));
	System.out.println("Binary leftshift: "+(x<<b));
	System.out.println("Binary RightShift: "+(x >>b));
	
	
	
	
	
	
}

}

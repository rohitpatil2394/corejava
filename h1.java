package oopsjava.d4;


class vehical{
	void start() {
		System.out.println("vehicalis start");
	}
}

class car extends vehical{
	 void m1() {
		 System.out.println("car is start");
	 }
}

class bike extends vehical{
	void m2() {
	System.out.println("bike is start");
}}


public class h1 {
	public static void main(String args[]) {
		bike b= new bike();
		b.start();
		b.m2();
		
		car c=new car();
		c.start();
		c.m1();
	}

}

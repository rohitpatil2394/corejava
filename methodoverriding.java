package oopsjava.d4;

class vehiclee {
	void start() {
		System.out.println("vehical is Starting");
	}

}
 class Bikee extends vehiclee{
	void start() {
		System.out.println("Bike is riading");
	}	
 }
 public class methodoverriding{
	public static void main(String args[]) {
		Bikee b= new Bikee();
		b.start();	
	}
}


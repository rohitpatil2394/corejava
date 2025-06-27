package oopsjava.d4;

interface Animals{
	void sound();
}
interface livingBeing{
	void breathe();
}

class dogs implements Animals,livingBeing{
	public void sound() {
		System.out.println("Dogs barks");
	}
	public void breathe() {
		System.out.println("dogs breathes");
	}
}


public class MultipleEx {
	public static void main(String args[]) {
		dogs d=new dogs();
		d.sound();
		d.breathe();
	}

}

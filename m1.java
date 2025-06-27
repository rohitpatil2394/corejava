package oopsjava.d4;

interface class1{
	void Webdesign();
}
interface class2{
	void webdevelope();
}

class Tcs implements class1,class2{	
	@Override
	public void webdevelope() {
		System.out.println(" Backgraund color green");
	}
	@Override
	public void Webdesign() {
		System.out.println("We want to wbsite design");
		
	}
	
}
public class m1 {
	public static void main(String args[]) {
		Tcs t=new Tcs();
		t.Webdesign();
		t.webdevelope();
	}

}


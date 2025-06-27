package oopsjava.d4;


interface a{
	void show();
}

class b implements a{
	public void show() {
		System.out.println("show form class b");
	}
	void displayb() {
		System.out.println("display from class b");
	}
}

class c implements a{
	public void show() {
		System.out.println("show from class c");
	}
	void displayc() {
		System.out.println("display from class c");
	}
}

class d {
	b B=new b();
	c C=new c();
	
	void useBoth() {
		B.show();
		B.displayb();
		C.show();
		C.displayc();
}
}

public interface HybridInheritance {
public static void main(String args[]) {
	d obj=new d();
	obj.useBoth();
}
}

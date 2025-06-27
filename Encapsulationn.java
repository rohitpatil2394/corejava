package oopsjava.d4;

 class G1{
	private String name;
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
}

public class Encapsulationn {
	public static void main(String args[]) {
		G1 g=new G1();
		g.setname("rohit");
		g.getname();
		System.out.println(g.getname());
	}

}

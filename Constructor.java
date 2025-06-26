package corejava.d1;

public class Constructor {
	
	Constructor(){
	
		System.out.println("default constructor");
	}
	
	Constructor(String name){
	
		System.out.println("parameterised constructor"+name);
		
	}
	public static void main(String args[]) {
		Constructor c1= new Constructor();
		Constructor c2= new Constructor("rohit");
		
		
	}

}

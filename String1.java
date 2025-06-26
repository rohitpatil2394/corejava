package corejava.d3;

public class String1 {
	public static void main(String args[]) {
		String name="java programming";
		String name1="java programming";
		
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.substring(3,5));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.contains("pro"));
		System.out.println(name.trim());
		System.out.println(name.indexOf("j"));
		System.out.println(name.equals(name1));
		System.out.println(name.concat(name1));
		System.out.println(name.replace("j","k"));
		
		String s= "pink;blue;white";
		String[] fruits= s.split(";");
		for(String f: fruits) {
			System.out.println(f);
		}
	}

}


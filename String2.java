package corejava.d3;

public class String2 {
public static void main(String args[]) {
	//reverse String
	String input="hello word";
	String reverse="";
	
	for(int i=input.length()-1; i>=0;i--) {
		reverse+=input.charAt(i);
	}
	System.out.println("reverse String : "+reverse);
	
}}

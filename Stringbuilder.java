package corejava.d3;

public class Stringbuilder {
	public static void main(String args[]) {
		StringBuilder sb= new StringBuilder("code ");
		sb.append(" with java");
		sb.insert(4," & build");
		sb.replace(0,4,"developer");
		System.out.println(sb);
	}

}

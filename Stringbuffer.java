package corejava.d3;

public class Stringbuffer {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("java");
		sb.append(" progarmming");
		sb.insert(0, "welcome to");
		sb.replace(0, 10, "hi,");
		sb.delete(4, 8);
		sb.reverse();
		
		System.out.println(sb);
	}

}

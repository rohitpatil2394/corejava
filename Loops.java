package corejava.d2;
import java.util.*;
public class Loops {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println("table of "+num+"="+(num*i));
			i++;
		}

		
		System.out.println("Even number ");
		int j=0;
		while(j<11) {
			if(j%2==0) {
			System.out.println(j);

		}
			j++;
		}
		
		System.out.println("Odd number ");
		int x=1;
		while(x<=10){
			if(x%2!=0) {
			System.out.println(x);

		}
			x++;
		}
	
		System.out.println("reverse no ");
	int y=10;
	while(y>=1) {
		System.out.println(y);
		y--;
		}
	}}

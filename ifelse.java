package corejava.d2;
import java.util.*;
public class ifelse {
	public static void main(String argd[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("applicable for voting");
		}else {
			System.out.println("not applicable for voting");
		}
		
		System.out.println("Enter Student marks :");
		int marks=sc.nextInt();
		if(marks>90) {
			System.out.println("First Rank");
		}
		else if(marks>=70 &&marks<90) {
			System.out.println("Secound rank");
		}
		else if(marks>=60 && marks<=70) {
			System.out.println("thrid Rank");
		}
		else if(marks>=40 && marks<=60) {
			System.out.println("middel");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}

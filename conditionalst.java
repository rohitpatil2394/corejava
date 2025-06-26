package corejava.d2;
import java.util.Scanner;
public class conditionalst {
	public static void main(String args[]) {
		int a=50;
		int b=25;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter a choice: ");
		   System.out.println("1.Addition ");
		   System.out.println("2.substraction ");
		   
		   int ch=sc.nextInt();
		   
		   switch(ch) {
		   case 1:
			   System.out.println(a+b);
			   break;
		   case 2:
			   System.out.println(a-b);
			   break;
		  
			   default:
				   System.out.println("invalid choice");
		   }
		   System.out.println("thankyou");
		
	}

}

package corejava.d2;
import java.util.*;

public class Scannerexample {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name :");
		String name= sc.nextLine();
		System.out.println("My name is :"+name);
		System.out.println();
		
		System.out.println("find Area of circle ");	
		System.out.println("Enter a radius:");
		double radius=sc.nextDouble();
		AreaOfCircle(radius);
		
		
		System.out.println();
		System.out.println("find Area of squre ");
		System.out.println("enter a side:");
		int a=sc.nextInt();
		AreaOfSqure(a);
		
		System.out.println();
		System.out.println("find Area of Triangle ");
		System.out.println("enter a base :");
		double base=sc.nextInt();
		System.out.println("enter a height :");
		double height=sc.nextDouble();
		AreaOfTriangle(base, height);
		
		System.out.println();
		System.out.println("find Area of Rectangle :");
		System.out.println("enter a lenght :");
		int l=sc.nextInt();
		System.out.println("enter a bridth :");
		int c=sc.nextInt();
		AreaOfRectangle(l,c);
		
		
		
		}
	
	public static void AreaOfCircle(double radius) {
	double area= 3.14 *radius*radius;
	System.out.println("Circle area is :"+area);
	}
	
	public static void AreaOfSqure(int a) {
		int Squre=a*a;
		System.out.println("Area of Squre is :"+Squre);
		
	}
	public static void AreaOfTriangle(double base , double height) {
		double area=0.5*base*height;
		System.out.println("Area of Triangle is :"+area);
		
	}
	public static void AreaOfRectangle(int l , int c) {
		
		System.out.println("Area of rectangle is :"+(2*1*c));
		
	}
	
	
}
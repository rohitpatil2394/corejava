package corejava.d3;

import java.util.Arrays;

public class Array1 {
	public static void main(String args[]) {
		int a[]= {40,90,60,10,8,7};
		for(int i=0; i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for(int i=0; i<a.length;i+=2) {
			System.out.print(" "+a[i]);
		}
		
		
		
		//max value
		System.out.println();
		int max=0;
		for(int i=0; i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}			
		}
		System.out.print(" max is:"+max);
		
		
		
		//min value
		System.out.println();
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}			
		}
		System.out.print(" min is:"+min);
		
		//secound maximum
		System.out.println();
		Arrays.sort(a);
		int s=a.length-2;
		 int smax=0;
		for(int i=0; i<a.length; i++) {
			smax=a[s];
		}
		System.out.println("secound max:"+smax);
		
		
//secound minimum
		System.out.println();
		Arrays.sort(a);
		int s1=1;
		 int smin=0;
		for(int i=0; i<a.length; i++) {
			smin=a[s1];
		}
		System.out.println("secound min:"+smin);
		
		
		//assending 
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
				int	temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
													
				}
			}
		}
		for(int i=0;i<a.length; i++) {
			System.out.print(" "+a[i]);
		}

		
		
		System.out.println();
		//decsending
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]<a[j+1]) {
				int	temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;							
				}
			}
		}
		for(int i=0;i<a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}

}


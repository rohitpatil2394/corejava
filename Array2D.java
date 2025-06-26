package corejava.d3;
import java.util.*;
public class Array2D {
	public static void main(String args[]) {
		int matrix[][]=new int[3][3];
		int n=matrix.length, m=matrix[0].length;
		//user input
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		//output
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
//	int matrix[][]= {
//			{2,3,4},
//			{4,5,6},
//			{8,5,3},
//			{4,7,8}
//	};
//	System.out.println(matrix.length);
//	
//	for(int i=0; i<matrix.length; i++) {
//		for(int j=0;j<matrix[i].length; j++) {
//			System.out.print(matrix[i][j]+" ");
//		}
//		System.out.println();		
//	}
		
		
	//
	

}}

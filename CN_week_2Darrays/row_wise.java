package CN_week_2Darrays;

import java.util.Scanner;

public class row_wise {

		// TODO Auto-generated method stub
		 public static void main(String[] args) {
			 int a[][]= {{1,2,3},
					 	{4,5,6},
					 	{7,8,9},
					 	{1,2,3}};
			 int arr[]=print(a);
			 for(int i=0;i<arr.length;i++) {
				 System.out.println(arr[i]+" ");
			 }
			 
			 System.out.println();
		
	}

		private static int[] print(int[][] a) {
			int totalElements = a.length * a[0].length;
			int arr[]=new int[totalElements];
			int idx=0;
			for(int i=0;i<a.length;i++) {
				
				for(int j=0;j<a[i].length;j++) {
					arr[idx]=a[i][j];
					idx++;
				} 
			} 
			return arr;
			
		}
		 
}



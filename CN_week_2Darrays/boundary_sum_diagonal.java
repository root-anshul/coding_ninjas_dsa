package CN_week_2Darrays;

import java.util.HashSet;
import java.util.Set;

public class boundary_sum_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
//		Set<Integer>set=new HashSet<>();
		
		int sum=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[0][i];
			sum=sum+arr[n-1][i];
		}
		
		for(int i=1;i<n-1;i++) {
			sum=sum+arr[i][0];
			sum=sum+arr[i][n-1];
		}
		for(int i=1;i<n-1;i++) {
			sum=sum+arr[i][i];
			sum=sum+arr[i][n-i-1];
		}
		if(n%2!=0) {
			sum=sum-arr[n/2][n/2];
		}
	
		
		
		System.out.println(sum);
		
		
		
		}

}

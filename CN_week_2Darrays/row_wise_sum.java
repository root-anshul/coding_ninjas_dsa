package CN_week_2Darrays;

public class row_wise_sum {
	 public static void main(String[] args) {
		 int arr[][]= { {4,5,3,2,6},
				 	  {7,5,3,8,9},
					  };
		
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 sum=sum+arr[i][j];
			 }
			 System.out.print(sum+" ");
			 sum=0;
		 }
	 
		 
	 }
}

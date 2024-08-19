package CN_week_2Darrays;

public class col_wise {
	 public static void main(String[] args) {
		 int a[][]= {{1,2,3},
				 	{4,5,6}};
	
//		 System.out.println(a[0].length);
		 int arr[]=print(a);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
	
	 
	 }

		private static int[] print(int[][] a) {
			int totalElements = a.length * a[0].length;
			int arr[]=new int[totalElements];
			int idx=0;
			for(int j=0;j<a[0].length;j++) {
				for(int i=0;i<a.length;i++) {
					arr[idx]=a[i][j];
					idx++;
				} 
			} 
			return arr;
			
		}
	 
}

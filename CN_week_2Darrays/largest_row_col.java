package CN_week_2Darrays;

public class largest_row_col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= {{6 ,9, 8, 5},
//					  {9 ,2 ,4 ,1},
//					  {8 ,3 ,9 ,3},
//					  {8 ,7, 8 ,6}};
		int n=0;
		int m=0;
		int arr[][]= {{0},{0}};
		System.out.println(arr);
//			int sum=Integer.MIN_VALUE;
			int maxrow=Integer.MIN_VALUE;
			int maxcol=Integer.MIN_VALUE;
			int rowidx=0;
			int colidx=0;
			String ans="";
			
			//row
			for(int i=0;i<arr.length;i++) {
				int sum=Integer.MIN_VALUE;

				for(int j=0;j<arr[0].length;j++) {
					sum=sum+arr[i][j];
					
				}
				if(sum>maxrow) {
					maxrow=sum;
					rowidx=i;
				}
				sum=0;
			}
			//col
			
			for(int i=0;i<arr[0].length;i++) {
				int sum=Integer.MIN_VALUE;
				for(int j=0;j<arr.length;j++) {
					sum=sum+arr[j][i];
//					System.out.println(sum);
					if(sum>maxcol) {
						maxcol=sum;
						colidx=i;
//						System.out.println(colidx);
//						System.out.println(sum);
					}
				}
			
			}
//			if (maxcol==Integer.MIN_VALUE) {
//				ans=ans+"row "+" "+rowidx+" "+maxcol;
//				
//			}
			if(maxrow>maxcol) {
				ans=ans+"row "+" "+rowidx+" "+maxrow;
						
			}else if(maxrow==maxcol) {
				ans=ans+"row "+rowidx+" "+maxrow;
			}else {
				ans=ans+"column "+colidx+" "+maxcol;
			}
//			System.out.println(ans);
		
	}

}

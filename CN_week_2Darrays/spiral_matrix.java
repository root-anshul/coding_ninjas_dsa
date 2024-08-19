package CN_week_2Darrays;

public class spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1 , 2 , 3  ,4 },
					  {14,15, 16,  5 },
					  {13,20, 17,  6 },
					  {12,19 ,18,  7 },
					  {11,10, 9,   8}};
		
		
		int uc=0;
		int lc=arr[0].length-1;
		
		int ur=0;
		int lr=arr.length-1;
		int total=arr[0].length*arr.length;
		int count=0;
		while(count<total) {
			for(int i=uc;i<=lc &&count<total ;i++) {
				System.out.print(arr[ur][i]+" ");
				count++;
			}
			ur++;

			for(int i=ur;i<=lr&&count<total;i++) {
				System.out.print(arr[i][lc]+" ");
				count++;
			}
			
			lc--;
			for(int i=lc;i>=uc&&count<total;i--) {
				System.out.print(arr[lr][i]+" ");
				count++;
			}
			
			lr--;
			for(int i=lr;i>=ur&&count<total;i--) {
				System.out.print(arr[i][uc]+" ");
				count++;
			}
			uc++;
			
			
			
		}

	}

}

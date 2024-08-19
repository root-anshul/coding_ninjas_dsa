package CN_week_2Darrays;

public class wave_print {
	public static void main(String[] args) {
		int arr[][]= {{1 ,2 ,3 },
					  {4,5 ,6 },
					  {7,8,9},
					  {10,11,12}};
		
		int n=arr.length;
		int m=arr[0].length;
		int count=0;
		int total=n*m;
		
		int ur=0;
		int uc=0;
		
		int lr=arr.length-1;
		int lc=arr.length-1;
		while(count<total) {
			for(int i=ur;i<=lr;i++) {
				System.out.print(arr[i][uc]+" ");
				count++;
			}
			uc++;
			lc++;
			if(count==total) {
				break;
			}
			for(int i=lr;i>=ur;i--) {
				System.out.print(arr[i][uc]+" ");
				count++;
			}
			uc++;
			lc++;
		}
		
	}
}

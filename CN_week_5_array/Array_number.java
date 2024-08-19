package CN_week_5_array;

import java.util.Scanner;

public class Array_number {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t-->0) {
		int n=in.nextInt();
		int arr[]=new int[n];
		int odd=0;
		int even=0;
		
		int i=1;
		int j=0;
		int k=n-1;
		while(i<=n) {
			if(i%2!=0) {
				arr[j]=i;
				j++;
			}else {
				arr[k]=i;
				k--;
			}
			
			i++;
		}
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}

	}
	}
}

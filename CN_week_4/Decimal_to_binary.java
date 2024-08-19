package CN_week_4;

import java.util.Scanner;

public class Decimal_to_binary {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		int []arr=new int[1000];
		int n=0;
		if(n==0) {
			System.out.print(0);
		}
		int rem=0;
		int i=0;
		
		while(n!=0 ) {
			arr[i]=n%2;
			n=n/2;
			i++;
			
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
		
	}
}

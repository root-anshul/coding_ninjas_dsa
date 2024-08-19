package CN_week_3;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
	
		System.out.print("*");
		System.out.println();
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("*");
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				for(int j=i-1;j>=1;j--) {
					System.out.print(j);
				}
			}else {
				for(int j=1;j<=(2*n)-i;j++) {
					System.out.print(j);
				}
				for(int j=(2*n-1)-i;j>=1;j--) {
					System.out.print(j);
				}
			}
			System.out.print("*");

			System.out.println();
		}
//		System.out.println();
		System.out.print("*");
	}
}

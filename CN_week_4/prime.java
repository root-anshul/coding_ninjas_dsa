package CN_week_4;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int i=2;
		int count=0;
		while(i<=n) {
			int j=2;
			while(j<i) {
				if(i%j==0) {
					count++;
					break;
				}
				j++;
			}
			
			if(count==0) {
				System.out.println(i);
				
			}
			count=0;
			i++;
		}
	}

}

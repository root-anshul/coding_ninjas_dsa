package CN_week_1_2;

import java.util.Scanner;

public class even_odd {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=132456;
		while(n>=0) {
			int rem=n/10;
			n=n%10;
			System.out.println(n);
		}
		
	}
	
}

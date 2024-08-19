package CN_week_4;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		int n=in.nextInt();
		int rem=0;
		int sum=0;
		while(n>=1) {
		
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		
System.out.println(sum);
	}

}

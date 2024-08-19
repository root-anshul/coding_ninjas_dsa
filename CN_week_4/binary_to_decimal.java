package CN_week_4;

import java.util.Scanner;

public class binary_to_decimal {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	int sum=0;
	int i=0;
	int b=0;
	while(n>=1) {
		
		sum=(n%10);
		n=n/10;
//        System.out.println(sum);
		b=(int) (b+(sum*Math.pow( 2,i)));
		i++;
		sum=0;
		}
	System.out.println(b);
	}
}

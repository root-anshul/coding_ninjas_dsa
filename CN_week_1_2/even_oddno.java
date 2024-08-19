package CN_week_1_2;

import java.util.Scanner;

public class even_oddno {
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
	int n= in.nextInt();
	int rem=0;
	int i=1;
	int e=0;
	int o=0;
	//System.out.println(132456%10);
	while(i<=n) {
		rem=n%10;
		if(rem%2==0) {
			e=e+rem;
		}else {
			o=o+rem;
		}
		n=n/10;
	}
	System.out.println(e+" "+o);
	}	
}

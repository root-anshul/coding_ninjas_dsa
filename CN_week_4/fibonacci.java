package CN_week_4;

import java.util.Scanner;

public class fibonacci {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int a=0;
		 int b=1;
		fib(a,b,n);
		
	}
	public static void fib(int a, int b,int n) {
		
		int i=0;
		int sum=0;
		while(i<n) {
			a=b;
			b=sum;
			sum=a+b;
			
			i++;
		}
		 System.out.println(sum);
	}
}

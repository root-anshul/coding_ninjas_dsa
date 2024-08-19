package CN_week_4;

import java.util.Scanner;

public class sum_or_product { 

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int n=in.nextInt();
		int c=in.nextInt();
		if(c==1) {
			int i=1;
			int sum=0;
			while(i<=n) {
				sum=sum+i;
				i++;
			}
			System.out.println(sum);
		}else if(c==2) {
			int i=1;
			long pro=1;
			while(i<=n) {
				pro=pro*i;
				i++;
			}
			System.out.println(pro);
		}else {
			System.out.println("-1");
		}

	}

}

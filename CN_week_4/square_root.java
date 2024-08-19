package CN_week_4;

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		int p=0;
		int ans=0;
		while(i<=n/2) {
			p=(int)Math.pow(i, 2);
			if(p<=n) {
				ans=i;
				
			}
			i++;
		}
		System.out.println(ans);
		

	}

}

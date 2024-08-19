package CN_week_4;

import java.util.Scanner;

public class AP_pro_of_4 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		int count=0;
		while(true) {
			int ap=3*i+2;
			if(ap%4!=0&& count<=n) {
				
			
				System.out.print(ap+" ");
				count++;
			}

			if(count>=n) {
				break;
			}
			i++;
			
		}
	}
}

package CN_week_1_2;

import java.util.Scanner;

public class F_to_C {
public static void main(String []args) {
	Scanner in =new Scanner (System.in);
//	int x1=in.nextInt();
//	int y1=in.nextInt();
//	
//	int x2=in.nextInt();
//	int y2=in.nextInt();
//	
//	int area=(x2-x1)*(y2-y1);
//	System.out.println(area);
//	
//	float f=(float) 1.4;

	int s=0;
	int e=100;
	int step=20;
	for(int i=s;i<=e;i=i+step) {
		int f= (i-32)*5/9;
		
		System.out.println(i+" "+f);
	}

	}
}

package CN_week_1_2;

import java.util.Scanner;

public class salary_of_emp {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
		int basic= in.nextInt();
		char ch=in.next().charAt(0);
		float pf=(float)(basic*0.11);
	
		float hra=(float)(basic*(0.2));

		float da=(float)(basic*(0.5));
		
		double sal=0.0;
		if(ch=='A') {
			sal=basic+hra+da+1700-pf;
		}else if(ch=='B') {
			sal=basic+hra+da+1500-pf;
		}else {
			sal=basic+hra+da+1300-pf;
		}
		System.out.println(Math.round(sal));
		
		//float s=8761.53f;
		
		
		//System.out.println(Math.round(8761.53));
		
	}
}

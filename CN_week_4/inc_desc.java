package CN_week_4;

import java.util.Scanner;

public class inc_desc {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		boolean isdesc=true;
		int i=1;
		int prev=arr[i-1];
		while(i<n) {
			int curr=arr[i];
			if(curr==prev) {
				System.out.println("false");
				return;
			}
			if(curr<prev) {
				if(isdesc==false) {
					System.out.println("false");
					return;
				}
			}else {
				if(isdesc==true) {
					isdesc=false;
				}
				
			}
			prev=curr;
			
			
			i++;
		}
			
		System.out.println("true");
		
	}
}

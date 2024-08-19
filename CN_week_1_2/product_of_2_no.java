package CN_week_1_2;

import java.util.Scanner;

public class product_of_2_no {
 public static void main(String []args) {
 Scanner in =new Scanner (System.in);
  int s=in.nextInt();
  int e=in.nextInt();
  int w=in.nextInt();
	int c=0;	   
while(s<=e) {
	c=(s-32)*5/9;
	System.out.println(s+" "+c);
	s=s+w;
}
	
 
 }
}

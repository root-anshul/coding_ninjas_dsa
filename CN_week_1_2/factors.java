package CN_week_1_2;
import java.util.Scanner;
public class factors {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=2;
		int count=0;
		while(i<n) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		if(count==0) {
			System.out.print("-1");
		}
		
		
	}
}

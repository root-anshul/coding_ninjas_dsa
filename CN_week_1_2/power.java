package CN_week_1_2;
import java.util.Scanner;
public class power {
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int n=in.nextInt();
    if(n==0) {
    	System.out.println(1);
    }else {
    	int po=(int)Math.pow(x,n);
    	System.out.println(po);
    }
}
	}

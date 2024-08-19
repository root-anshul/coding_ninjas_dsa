package CN_week_8_recurrsion;

public class multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=4000000;
		int n=500;
		
		int ans=multiplyTwoIntegers(m,n);
		System.out.println(ans);
	}

	private static int multiplyTwoIntegers(int m, int n) {
		// TODO Auto-generated method stub
		if(m==0||n==0) {
			return 0;
		}
		
		return multi(m,n,1);
		
	}

	private static int multi(int m, int n, int i) {
		// TODO Auto-generated method stub
		
		if(i>n) {
			return 1;
		}
		if(i==n) {
			return m*i;
		}
		return multi(m,n,i+1);
		
	} 
}

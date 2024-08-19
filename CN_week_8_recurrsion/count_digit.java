package CN_week_8_recurrsion;

public class count_digit {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ans=count(1234567);
		System.out.println(3/10);
	}

	private static int count(int n) {
		if(n/10==0) {
		return 1; 
		}
		return 1+count(n/10);
		
	}

}

package CN_week_8_recurrsion;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int ans=sum(num);
		System.out.println(ans);
	}

	private static int sum(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 0;
		}
		return sod(num,0);
	}

	private static int sod(int num,int sum) {
		// TODO Auto-generated method stub
		
		if(num==0) {
			return sum;
		}
		
		int a=num%10;
		sum=sum+a;
		return sod(num/10,sum);
		
		
	}

}

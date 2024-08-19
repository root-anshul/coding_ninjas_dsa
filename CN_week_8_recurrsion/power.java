package CN_week_8_recurrsion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=pow(2,5);
		System.out.println(ans);
	}
	public static int pow(int x,int n){
		if(n==0) {
			return 1;
		}
			int power=x*pow(x,n-1);
			return power;
	}

}

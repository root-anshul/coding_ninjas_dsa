package CN_week_9_recurrsion_2;

public class count_staircase {
	static int cout=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int ans=countst(n);
		System.out.println(ans);
	}
	
	private static int countst(int n) {
		// TODO Auto-generated method stub
		return count(n);
	}
	
	private static int count(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
//			System.out.println(cout);
			return 1;
		}
		if(n<0) {
			return 0;
		} 
		return count(n-1)+count(n-2)+count(n-3);
		
	}

}

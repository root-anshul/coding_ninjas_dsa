package CN_week_9_recurrsion_2;

public class tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		tower(n, 'a', 'b', 'c');

	}
	

	private static void tower(int n, char s, char h, char d) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		if(n==1) {
			System.out.println(""+s+" "+d);
			return;
		}
		tower(n-1,s,d,h);
		System.out.println(""+s+" "+d);
		tower(n-1,h,s,d);
		
	}

}

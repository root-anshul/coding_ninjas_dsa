package CN_week_9_recurrsion_2;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1123;
		//check(n);
	}
	private static String helper(int n) {
		if(n==0) {
			System.exit(0);
		}
		String help[]= {"a","b","c","d","e","f","i","j","k","l",
				"m","n","o","p","q",
				"r","s","t","u","v","w","x","y","z"};
		return help[n-1];
	}

}

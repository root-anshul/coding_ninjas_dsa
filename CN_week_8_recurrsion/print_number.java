package CN_week_8_recurrsion;

public class print_number {
	public static void main(String[] args) {
		print(6);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		  if(n==0) {
			  return;
		  }
		  print(n-1);
		 System.out.print(n+" ");
		  
		  
	}
}

package CN_week_8_recurrsion;

public class check_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {9,10};
		int x=9;
		boolean ans=check(arr,x);
		System.out.println(ans);
	}

	private static boolean check(int[] arr,int x) {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return false;
		}
		if(arr[0]==x) {
			return true;
		}
		int sm[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			sm[i-1]=arr[i];
		}
		return check(sm,x);
	
	}

}

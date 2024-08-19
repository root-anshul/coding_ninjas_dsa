package CN_week_8_recurrsion;

public class input_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,9};
		int ans=sum(arr);
		System.out.println(ans);
	}

	private static int sum(int[] arr) {
		// TODO Auto-generated method stub
	 return sum(arr,0);
	}
	private static int sum(int[] arr ,int i) {
		if(arr.length==i) {
			return 0;
		}
		return arr[i]+sum(arr,i+1);
	}
}

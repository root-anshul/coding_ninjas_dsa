package CN_week_10_TnC_complexity;

public class find_unique {
	public static void main(String[]args) {
		int arr[]= {0 ,7, 2, 5, 4, 7, 1, 3, 6};
		
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			ans=ans^arr[i];

		}
		System.out.println(ans);
	}
}

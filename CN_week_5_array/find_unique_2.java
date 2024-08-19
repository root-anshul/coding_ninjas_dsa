package CN_week_5_array;

public class find_unique_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2 ,3 ,1, 6, 3 ,6, 2};
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=ans) {
				ans=arr[i];
			}
		}
		System.out.println(ans);
	}

}

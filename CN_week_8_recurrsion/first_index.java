package CN_week_8_recurrsion;

public class first_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,9,10,8};
		int x=8;
		
		int ans=first(arr,x);
		System.out.println(ans);
	}

	private static int first(int[] arr, int x) {
		// TODO Auto-generated method stub
		return first(arr,0,x);
	}

	private static int first(int[] arr, int i,int x) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==x) {
			return i;
		}
		return first(arr,i+1,x);
		
	}

}

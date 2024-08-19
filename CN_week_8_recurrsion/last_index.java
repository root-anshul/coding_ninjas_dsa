package CN_week_8_recurrsion;

public class last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,89,9,0};
		int x=8;
		int ans=first(arr,x);
		System.out.println(ans);
	}

	private static int first(int[] arr, int x) {
		int len=arr.length-1;
		return first(arr,x,len);
	}

	private static int first(int[] arr, int x, int i) {
		// TODO Auto-generated method stub
		
		if(i<0) {
			return -1;
		}
		if(arr[i]==x) {
			return i;
		}
		return first(arr,x,i-1);
		
	}

}

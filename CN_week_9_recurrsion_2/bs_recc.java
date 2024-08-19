package CN_week_9_recurrsion_2;

public class bs_recc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2 ,3 ,4 ,5 ,6 ,8 ,9};
		int n=9;
		int ans=rec(arr,n);
		System.out.println(ans);
	}

	private static int rec(int[] arr, int n) {
		int mid=arr[0];
		// TODO Auto-generated method stub
		return search(arr,n,0,mid,arr.length-1);
	}

	private static int search(int[] arr, int n, int i,int mid, int j) {
		// TODO Auto-generated method stub
		mid=i+(j-i)/2;
		if(arr[mid]==n) {
			return mid;
		}
		else if(i>j) {
			return -1;
		}
		else if(arr[mid]>n) {
			return search(arr, n, i, mid, mid-1);
		}else {
			return search(arr, n, mid+1, mid, j);
		}
		
	}

}

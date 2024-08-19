package CN_week_9_recurrsion_2;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 3, 7, 9, 11, 12, 45};
		int tar=0;
		int start=0;
		int end=arr.length-1;
		
		int num=search(arr,tar,0,0,arr.length-1);
		System.out.println(num);
	}

	private static int search(int[] arr, int tar,int start,int mid,int end) {
		// TODO Auto-generated method stub
		if(start>end) {
			return -1;
		}
		mid=start+(end-start)/2;
		if(arr[mid]==tar) {
			return mid;
		}else if(arr[mid]>tar) {
			end=mid-1;
			return search(arr, tar, start, mid, end);
		}else  {
			start=mid+1;
			return search(arr, tar, start, mid, end);
		}
		
	}

}

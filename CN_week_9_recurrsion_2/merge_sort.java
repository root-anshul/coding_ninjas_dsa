package CN_week_9_recurrsion_2;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 13, 4, 1, 3, 6, 28};
		System.out.println(1/2);
		merge(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

	private static void merge(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid =(si+ei)/2;
		merge(arr,si,mid);
		merge(arr,mid+1,ei);
		mergeSort(arr,si,ei);
		
		
	}

	private static void mergeSort (int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int mid=(si+ei)/2;
		
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}else {
				ans[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		while(j<=ei) {
			ans[k]=arr[j];
			k++;
			j++;
		}
		for(int idx=0;idx<ans.length;idx++) {
			arr[si+idx]=ans[idx];
		}
	}

}

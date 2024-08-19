package CN_week_5_array;

public class sort_0_1 {

	public static void main(String[] args) {
		int arr[]= {0 ,1 ,0 ,1 ,0};
//		1
//		11
//		1 1 0 0 1 0 0 0 0 0 1 

		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]==1&& arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]==0&& arr[j]==0) {
				i++;
			}
			else if(arr[i]==1&& arr[j]==1) {
				j--;
			}else {
				i++;
				j--;
			}
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}

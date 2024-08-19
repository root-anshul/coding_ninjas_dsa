package CN_week_5_array;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,3,6,2,0};
		
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

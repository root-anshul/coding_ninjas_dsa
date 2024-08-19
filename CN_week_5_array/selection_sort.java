package CN_week_5_array;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,6,2,5,1};
			
		for(int i=0;i<arr.length;i++) {
		int min=arr[i];
		int minIdx=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
				minIdx=j;
			}
		}
		if(minIdx!=i) {
			arr[minIdx]=arr[i];
			arr[i]=min;
		}
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

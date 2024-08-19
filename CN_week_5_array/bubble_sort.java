package CN_week_5_array;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 13, 4, 1, 3, 6, 28};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j]; 
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

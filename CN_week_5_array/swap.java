package CN_week_5_array;

public class swap {

	public static void main(String[] args) {
		int arr[]= {9 ,3, 6, 12, 4, 32};
		
		for(int i=0;i<arr.length-1;i=i+2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

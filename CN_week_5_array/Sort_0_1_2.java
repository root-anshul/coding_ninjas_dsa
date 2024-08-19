package CN_week_5_array;

public class Sort_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={0,1,2,0,1,1,2,0,2};
		
		int start=0;
		int end=arr.length-1;
		int mid=0;
		
		while(mid<=end) {
			if(arr[mid]==2) {
				int temp=arr[mid];
				arr[mid]=arr[end];
				arr[end]=temp;
				
				end--;
				
			}else if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[start];
				arr[start]=temp;
				mid++;
				start++;
			}else {
				mid++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		

	}

}

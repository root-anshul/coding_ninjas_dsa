package CN_week_10_TnC_complexity;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		if(arr.length==0){
            return;
        }


        k=k%arr.length;
        int n=arr.length;
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
        }
	}
	 public static void swap(int arr[],int start,int end){
	        while(start<=end){
	            int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;
	        }
	        }

}

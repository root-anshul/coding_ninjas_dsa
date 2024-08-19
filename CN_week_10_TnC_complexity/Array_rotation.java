package CN_week_10_TnC_complexity;

public class Array_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,6,1};
		int count=1;
		int ans=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				count++;
			}else {
				ans=count;
				//return ans;
			}
		}
		//return 0;
		
	
	}

}

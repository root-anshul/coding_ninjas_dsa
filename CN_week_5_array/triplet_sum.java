package CN_week_5_array;

public class triplet_sum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int n=12;
		int count=0;
		for(int i=0;i<=arr.length-3;i++) {
			for(int j=i+1;j<=arr.length-2;j++) {
				for(int k=j+1;k<=arr.length-1;k++) {
					if(arr[i]+arr[j]+arr[k]==n) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}

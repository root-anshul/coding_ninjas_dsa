package CN_week_5_array;

public class find_unique {
	public static void main(String[] args) {
		int arr[]= {2 ,3 ,1, 6, 3 ,6, 2};
		int ans=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					
					continue;
				}else {
					ans=arr[i];
					break;
				}
			}
		}
		System.out.println(ans);
	}
} 

package CN_week_10_TnC_complexity;

public class duplicate_in_array {
	public static void main(String[]args) {
		int arr[]= {0 ,7, 2, 5, 4, 7, 1, 3, 6};
		
		boolean []set=new boolean[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			if(set[arr[i]]==true) {
				System.out.println(arr[i]);
				System.out.println(set[arr[i]]);
				System.out.println(arr[i]);
//				return arr[i];
			}
			
			set[arr[i]]=true;
	
		}
	
	}
}

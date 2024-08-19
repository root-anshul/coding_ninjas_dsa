package CN_week_5_array;

import java.util.Arrays;

public class small_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr1[]= {10, 20, 30};
			int n=3;
			int m=2;
			int arr2[]= {17,15};
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int ans=Math.abs(arr1[0]-arr2[0]);
			
			int j=0;
			int i=0;
			while(i<n&&j<m) {
				int diff=Math.abs(arr1[i]-arr2[j]);
				ans=Math.min(ans,diff);
				if(arr1[i]>arr2[j]) {
					j++;
				}else {
					i++;
				}
			}
			System.out.println(ans);
	
		
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
//		String a="coding";	
//	//            012345	
//		for(int i=2;i<4;i++)
//		{
//		    System.out.print(a.substring(i));
		//}
	}

}

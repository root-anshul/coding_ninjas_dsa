package CN_week_10_TnC_complexity;

import java.util.Arrays;

public class Array_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,1,1,1,1};
		
		if(arr1.length==0 || arr2.length==0) {
			return;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int min =Math.min(arr1.length, arr2.length);
		System.out.println(min);
		
		int i=0;
		int j=0;
		while(i<min) {
			if(arr1[i]==arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		} 
		
	}

}

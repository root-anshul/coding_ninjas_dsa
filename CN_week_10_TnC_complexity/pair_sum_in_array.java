package CN_week_10_TnC_complexity;

import java.util.HashMap;
import java.util.HashSet;

public class pair_sum_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 3, 6, 2, 5, 4, 3, 2, 4};
		int sum=7;
		HashSet<Integer> set;
		HashMap<Integer,Integer>hp =new HashMap<>();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			hp.put(arr[i], hp.getOrDefault(arr[i], 0)+1);
		}
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>sum) {
				continue;
			}
			int secval=sum-arr[i];
			if(hp.getOrDefault(secval, 0)>0) {
				res =res+hp.get(secval);
				hp.put(arr[i],hp.get(arr[i])-1);
				if(arr[i]==secval) {
					res=res-1;
				}
			}
		}
		System.out.println(res);
		
	}

}

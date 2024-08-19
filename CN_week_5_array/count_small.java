package CN_week_5_array;

public class count_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= {4,5,6,7};
		int b[]= {6,7};		
		int arr[]=new int[a.length];
		
		int count=0;
		
		int i=0;
		
	
		while(i<a.length) {
			count=0;
			for(int j=0;j<b.length;j++) {
			if(b[j]<=a[i]) {
				count++;
				
			 }
			}
			arr[i]=count;
			
			i++;
		}
//		return arr;
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		

	}

}

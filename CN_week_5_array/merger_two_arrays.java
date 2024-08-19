package CN_week_5_array;

public class merger_two_arrays {

	public static void main(String[] args) {
			int a[]= {1 ,3 ,4 ,7 };
			int b[]= {2 ,4 ,6 ,13};
			int arr[]=new int[a.length+b.length];
			
			int i=0;
			int j=0;
			int k=0;
		
			while(a.length>i && b.length>j) {
				if(a[i]>b[j]) {
					arr[k]=b[j];
					j++;
					k++;
				}else {
					arr[k]=a[i];
					k++;
					i++;
				}
			}
			while(a.length>i) {
				arr[k]=a[i];
				i++;
				k++;
			}
			while(b.length>j) {
				arr[k]=b[j];
				j++;
				k++;
			}
			
			
			for(int l=0;l<arr.length;l++) {
				System.out.print(arr[l]+" ");
			}
			
	}

}

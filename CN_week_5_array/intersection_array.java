package CN_week_5_array;

public class intersection_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {11,11,12,12,13};
		int arr2[] = {11,12,12,13,13};
		
		if(arr1.length>arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						System.out.print(arr1[i]+" ");
						arr2[j]=-1;
					break;
					}
				}
			}
			
		}else if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						System.out.print(arr1[i]+" ");
						arr2[j]=-1;
						break;
					}
				}
			}
			
			
		}else {
			
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr2[i]==arr1[j]) {
						System.out.print(arr2[i]+" ");
						arr1[j]=-1;
						break;
					}
				}
			}
			
		}
		
		
		
		
		
		
	}

}

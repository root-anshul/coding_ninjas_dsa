package CN_week_2Darrays;

public class Square_mat_diagonal {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		String str="";
		int diag[]=new int[Math.min(n, m)];
		if(n!=m) {
//			str="NO";
//			System.out.println(str);
//			return "NO";
		}else {
			//str="YES";
//			System.out.println(str);
//			return "YES";
		}
		int i=0;
		int j=0;
		while(i<arr.length) {
			diag[i]=arr[i][j];
			i++;
			j++;
			
		} 
		for(int k=0;k<diag.length;k++) {
			System.out.print(diag[k]+" ");
		}
			
	
	}

}

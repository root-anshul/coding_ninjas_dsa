package CN_week_2Darrays;

public class transpose_of_mat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=2;
		int mat[][]={{1,2},
					 {2,3},
					 {3,4}};
		
		int[][] arr=new int [n][m];
		int k=0;
		int l=0;
		int count=0;
		int total=m*n;
		while(count<total) {
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[0].length;j++) {
					arr[k][l]=mat[i][j];
					k++;
					count++;
				}
				k=0;
				l++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

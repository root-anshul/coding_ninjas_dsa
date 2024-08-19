package CN_week_8_recurrsion;

public class all_indexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,10,8,8};
		int x=8;
		all(arr,x);
	}

	private static int[] all(int[] input, int x) {
		// TODO Auto-generated method stub
		return allIndexes(input,x,0);
	
		
	}
	public static int[] allIndexes(int input[], int x, int startIndex) {
		
        if(startIndex==input.length){
            int output[] = new int[0];
            return output;
        }
        int smallOutput[] = allIndexes(input,x, startIndex+1);
		if(input[startIndex]==x){
            int output[] = new int[smallOutput.length +1];
            output[0] = startIndex;
            for(int i=0;i<smallOutput.length;i++){
             
            output[i+1] = smallOutput[i];
            }
            return output;
        }
        else{
            return smallOutput;
        }
    }
	

}

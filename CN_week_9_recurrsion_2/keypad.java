package CN_week_9_recurrsion_2;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23;
		
		String []ans=keypad(n);
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}
//		System.out.println(23%10);
	}
private static String[] helper(int n) {
	 if(n<=1 || n>10){
         System.exit(0);
     }
	
		if(n==2) {
			return new String[]{"a","b","c"};
		}else if(n==3) {
			return new String[]{"d","e","f"};
		}else if(n==4) {
			return new String[]{"g","h","i"};
		}else if(n==5) {
			return new String[]{"j","k","l"};
		}else if(n==6) {
			return new String[]{"m","n","o"};
		}else if(n==7) {
			return new String[]{"p","q","r","s"};
		}else if(n==8) {
			return new String[]{"t","u","v"};
		}else {
			return new String[]{"w","x","y","z"};
		}
}



private static String[] keypad(int n) {
	if(n==0) {
		String output[]={""};
//		System.out.println(output.length);
		return output ;
	}
	
	
	String []smallnumber =keypad(n/10);
	 String singleDigitOutput[] = helper(n%10);
	
	 String output[] = new String[singleDigitOutput.length * smallnumber.length];
	int idx=0;
	for(int i=0;i<singleDigitOutput.length;i++) {
		for(int j=0;j<smallnumber.length;j++) {
			output[idx]=smallnumber[j]+singleDigitOutput[i];
			idx++;
		}
	}
	return output;
}
	
	
	
	
	
	

	
}

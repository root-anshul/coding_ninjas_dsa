package CN_week_8_recurrsion;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaabbbbcccc";
		boolean ans= palin(str);
		System.out.println(ans);
	}

	private static boolean palin(String str) {
		// TODO Auto-generated method stub
//		if(str.charAt(0)!=str.charAt(str.length()-1)) {
//			return false;
//		}
		return palin(str,0,str.length()-1);
	}

	private static boolean palin(String str, int i, int j) {
		// TODO Auto-generated method stub
		if( i>j){
            return true;
        }

	 if(str.charAt(i)!=str.charAt(j)){
			return false;
		}
		
		return palin(str,i+1,j-1);
		 
		
	}	

}

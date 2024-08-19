package CN_week_9_recurrsion_2;

public class replace_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxxyyyzwwzzz";
		String ans=remove(str);
		System.out.println(ans);
		
	}

	private static String remove(String str) {
		// TODO Auto-generated method stub
		String ans=""+str.charAt(0);
		return remove(str,0,ans);
	}
		
	
	private static String remove(String str, int i,String ans) {
		// TODO Auto-generated method stub
		
		if(i==str.length()) {
			return ans;
		}
		if(ans.charAt(ans.length()-1) !=str.charAt(i)) {
			ans=ans+str.charAt(i);
		}
		return remove(str,i+1,ans);
		
	}

}
